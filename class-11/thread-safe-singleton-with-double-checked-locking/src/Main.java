/**
 * Expected: thread safe singleton with double checked locking.
 * 
 * @author Yahor Makedon
 */
public class Main {
	public static void main(String[] args) {
		try {
			Thread t1 = new Thread(() -> Singleton.getInstance().increment(10));
			t1.start();
			t1.join();

			Thread t2 = new Thread(() -> Singleton.getInstance().increment(10));
			t2.start();
			t2.join();

			Thread t3 = new Thread(() -> Singleton.getInstance().increment(10));
			t3.start();
			t3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println(Singleton.getInstance().getCount());
	}
}