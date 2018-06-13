public class Main {
	public static void main(String[] args) {
		try {
			Thread t1 = new Thread(() -> {
				Singleton o = Singleton.getInstance();
				o.increment();
			});
			t1.start();
			t1.join();

			Thread t2 = new Thread(() -> {
				Singleton o = Singleton.getInstance();
				o.increment();
			});
			t2.start();
			t2.join();

			Thread t3 = new Thread(() -> {
				Singleton o = Singleton.getInstance();
				o.increment();
			});
			t3.start();
			t3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Singleton.getInstance().getCount());
	}
}