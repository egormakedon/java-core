public class Main {
	public class A {
		public void print() {
			System.out.println("Hello world!");
		}
	}

	public static void main(String[] args) {
		new Main().start();
	}

	private void start() {
		A a = new A (){
			@Override
			public void print() {
				System.out.println("Hi, world!");
			}
		};
		a.print();
	}
}