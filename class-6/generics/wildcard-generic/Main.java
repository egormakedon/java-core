import java.util.*;

/**
 * Expected: printed different lists using wildcard.
 * 
 * @author Yahor Makedon
 */
public class Main {
	public static void main(String[] args) {
		List<Integer> l1 = new ArrayList<>();
		List<Double> l2 = new ArrayList<>();
		List<String> l3 = new ArrayList<>();

		l1.add(0);
		l1.add(1);
		l1.add(2);
		l1.add(3);
		l1.add(4);
		l1.add(5);

		l2.add(0.0d);
		l2.add(1.1d);
		l2.add(2.2d);
		l2.add(3.3d);
		l2.add(4.4d);
		l2.add(5.5d);

		l3.add("Hello, World!");

		print(l1);
		print(l2);
		print(l3);		
	}

	private static void print(List<?> list) {
		System.out.println(list);
	}
}