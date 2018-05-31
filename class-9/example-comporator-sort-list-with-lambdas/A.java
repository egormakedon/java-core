import java.util.*;

public class A {
	public static void main(String[] args) {
		List list = new ArrayList();

		list.add(10);
		list.add(0);
		list.add(-1);
		list.add(2);
		list.add(7);
		list.add(-4);
		list.add(5);
		list.add(5);
		list.add(3);

		System.out.println("Without sorting: " + list);

		Collections.sort(list, (Integer num1, Integer num2) -> {
			return num2 - num1;
		});

		System.out.println("По убыванию: " + list);

		Collections.sort(list, (Integer num1, Integer num2) -> {
			return num1 - num2;
		});

		System.out.println("По возрастанию: " + list);
	}
}