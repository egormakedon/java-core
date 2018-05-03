import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class MyClassLoader extends ClassLoader{
    private Map<String, Class<?>> classes = new HashMap<>();

    @Override
    public Class<?> findClass(String name) throws ClassNotFoundException {
        if (classes.containsKey(name)) {
            return classes.get(name);
        }
        byte[] classData;
        try {
            classData = loadClassData(name);
        } catch (IOException e) {
            throw new ClassNotFoundException("Class [" + name
                    + "] could not be found", e);
        }
        Class<?> c = defineClass(name, classData, 0, classData.length);
        resolveClass(c);
        classes.put(name, c);
        return c;
    }

    private byte[] loadClassData(String className) throws IOException {
        BufferedInputStream in = new BufferedInputStream(getSystemResourceAsStream(className + ".class"));
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        int i;
        while ((i = in.read()) != -1) {
            out.write(i);
        }
        in.close();
        byte[] classData = out.toByteArray();
        out.close();
        return classData;
    }
}