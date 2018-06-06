public class A {
	public static void main(String[] args) throws Exception {
		(new Thread(() -> {
			for (int i = 0; i < 15; i++) {
				System.out.println(i);

				try {
					Thread.sleep(200);
				} catch(Exception e) {
					e.printStackTrace();
				}
			}
		})).start();

		(new Thread(() -> {
			for (int i = 0; i < 15; i++) {
				System.out.println("Hello, world!");

				try {
					Thread.sleep(200);
				} catch(Exception e) {
					e.printStackTrace();
				}
			}
		})).start();

		Thread.sleep(3000);

		Thread thread = new Thread(() -> {
			for (int i = 0; i < 5; i++) {
				System.out.println(Thread.currentThread());

				try {
					Thread.sleep(500);
				} catch(Exception e) {
					e.printStackTrace();
				}
			}
		});

		thread.start();
		thread.join();

		System.out.println("Complete");
	}
}