/**
 * Expected: thread created and started by another thread.
 * 
 * @author Yahor Makedon
 */
public class Main {
	public static void main(String[] args) {
		Thread t = new Thread(new MyThread());
		t.start();
	}

	private static class MyThread extends Thread {
		@Override
		public void run() {
			System.out.println("Hello, World!");
		}
	}
}