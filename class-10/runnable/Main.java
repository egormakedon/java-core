/**
 * Expected: used runnable with lambdas.
 * 
 * @author Yahor Makedon
 */
public class Main {
	public static void main(String[] args) throws Exception {
		createAndGetThread(() -> {
			for (int i = 0; i < 15; i++) {
				System.out.println(i);

				try {
					Thread.sleep(200);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}).start();

		createAndGetThread(() -> {
			for (int i = 0; i < 15; i++) {
				System.out.println("Hello, World!");

				try {
					Thread.sleep(200);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}).start();

		Thread.sleep(3000);

		Thread t = createAndGetThread(() -> {
			for (int i = 0; i < 5; i++) {
				System.out.println(Thread.currentThread());

				try {
					Thread.sleep(500);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

		t.start();
		t.join();

		System.out.println("Complete");
	}

	private static Thread createAndGetThread(Runnable runnable) {
		return new Thread(runnable);
	}
}