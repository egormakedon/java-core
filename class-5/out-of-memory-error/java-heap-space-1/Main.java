import java.util.*;

/**
 * Expected: java.lang.OutOfMemoryError: Java heap space.
 * 
 * @author Yahor Makedon
 */
public class Main {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		Integer i = Integer.MIN_VALUE;

		while (true) {
			list.add(i);
			i++;
		}
	}
}