import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * @author Yahor Makedon
 */
public class MyClassLoader extends ClassLoader {
	private static final Map<String, Class<?>> classMap = new HashMap<>();

	@Override
	public Class<?> findClass(String name) throws ClassNotFoundException {
		Class<?> clazz;

		if (classMap.containsKey(name)) {
			clazz = classMap.get(name);
		} else {
			byte[] classData = loadClassData(name);
			clazz = defineClass(name, classData, 0, classData.length);
			resolveClass(clazz);
			classMap.put(name, clazz);
		}

		return clazz;
	}

	private byte[] loadClassData(String className) throws ClassNotFoundException {
		try (BufferedInputStream in = new BufferedInputStream(Objects.requireNonNull(
				getSystemResourceAsStream(String.format("%s.class", className))));
			 ByteArrayOutputStream out = new ByteArrayOutputStream()) {
			int i;
			while ((i = in.read()) != -1) {
				out.write(i);
			}

			return out.toByteArray();
		} catch (IOException e) {
			throw new ClassNotFoundException(String.format("Class [%s] could not be found.", className), e);
		}
	}
}
