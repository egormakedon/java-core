import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            MyClassLoader myClassLoader = new MyClassLoader();
            List<Class> animals = new ArrayList<>();
            animals.add(myClassLoader.findClass("Cat"));
            animals.add(myClassLoader.findClass("Dog"));
            Animal cat = (Animal) animals.get(0).newInstance();
            Animal dog = (Animal) animals.get(1).newInstance();
            cat.play();
            cat.voice();
            dog.play();
            dog.voice();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
