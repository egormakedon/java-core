public class A {
	static class MyThread extends Thread {
		@Override
		public void run() {
			System.out.println("Hello, World");
		}
	}

	public static void main(String[] args) {
		Thread t = new Thread(new MyThread());
		t.start();
	}
}