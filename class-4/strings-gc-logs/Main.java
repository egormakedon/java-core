import java.util.*;

/**
 * Expected: gc-logs created.
 * 
 * @author Yahor Makedon
 */
public class Main {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();

		for (int i = 0; i < 1_000_000; i++) {
			list.add("Element - " + i);
		}

		list = new ArrayList();

		for (int i = 0; i < 10_000_000; i++) {
			list.add("#" + i + "#");
		}

		list = null;
		System.gc();

		for (int i = 0; i < 10_000_000; i++) {
			System.out.println(i);
		}
	}
}