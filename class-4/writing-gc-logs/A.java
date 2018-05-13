import java.util.*;

public class A {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		for (int index = 0; index < 1000000; index++) {
			list.add("Element - " + index);
		}
		list = new ArrayList();
		for (int index = 0; index < 10000000; index++) {
			list.add("#" + index + "#");
		}
		list = null;
		System.gc();
		for (int index = 0; index < 10000000; index++) {
			System.out.println(index);
		}
	}
}