import java.util.*;

public class A {
	public static void main(String[] args) {
		new A().start();
	}

	private void start() {
		List<Integer> list = new ArrayList<>();
		Integer i = -2000000000;
		while(true) {
			list.add(i);
			i++;
		}
	}
}