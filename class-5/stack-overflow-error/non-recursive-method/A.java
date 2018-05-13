public class A {
	public static void main(String[] args) {
		try {
			new A().start();
		} catch(StackOverflowError e) {
			e.printStackTrace();
			System.out.println("StackOverflowError - pemranent chain of methods call");
		}
	} 

	private void start() {
		a();
	}

	private void a() {
		b();
	}

	private void b() {
		c();
	}

	private void c() {
		a();
	}
}