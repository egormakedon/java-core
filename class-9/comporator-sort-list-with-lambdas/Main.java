import java.util.*;

/**
 * Expected: sort list with comporator using lambdas by ascending and descending orders.
 * 
 * @author Yahor Makedon
 */
public class Main {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10, 0, -1, 2, 7, -4, 5, 5, 3);

		System.out.printf("Default: %s\n", list);

		Collections.sort(list, (num1, num2) -> num2 - num1);
		System.out.printf("Descending: %s\n", list);

		Collections.sort(list, (num1, num2) -> num1 - num2);
		System.out.printf("Ascending: %s\n", list);
	}
}