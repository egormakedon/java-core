import java.util.concurrent.*;
import java.util.concurrent.atomic.*;

/**
 * Expected: synchronization.
 * 
 * @author Yahor Makedon
 */
public class Main {
	private static final int COUNT_SIZE = 10;
	private AtomicInteger counter = new AtomicInteger(0);

	public static void main(String[] args) {
		Main m = new Main();
		ExecutorService executorService = null;

		try {
			executorService = Executors.newFixedThreadPool(COUNT_SIZE);

			for (int i = 0; i < COUNT_SIZE; i++) {
				executorService.submit(() -> m.incrementAndPrint());
			}
		} finally {
			if (executorService != null) {
				executorService.shutdown();
			}
		}
	}

	private void incrementAndPrint() {
		synchronized (this) {
			System.out.println(counter.incrementAndGet());
		}
	}
}