public class A {
	public static void main(String[] args) {
		try {
			new A().start();
		} catch (StackOverflowError e) {
			e.printStackTrace();
			System.out.println("StackOverflowError - recursive method");
		}
	}

	private void start() {
		int[] a = new int[1000];
		for (int i = 0; i < 1000; i++) {
			a[i] = i;
		}
		start();
	}
}