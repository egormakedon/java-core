import java.util.Arrays;
import java.util.List;

/**
 * @author Yahor Makedon
 */
public class Main {
	public static void main(String[] args) {
		try {
			MyClassLoader myClassLoader = new MyClassLoader();
			List<Class<?>> animalClassList = Arrays.asList(myClassLoader.findClass("Cat"),
					myClassLoader.findClass("Dog"));
			for (Class<?> animalClass : animalClassList) {
				doAnimal((Animal) animalClass.newInstance());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void doAnimal(Animal animal) {
		animal.play();
		animal.voice();
	}
}
