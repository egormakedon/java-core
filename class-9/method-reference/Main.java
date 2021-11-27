import java.util.*;

/**
 * Expected: method reference.
 * 
 * @author Yahor Makedon
 */
public class Main {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);
		list.forEach(System.out::println);
	}
}