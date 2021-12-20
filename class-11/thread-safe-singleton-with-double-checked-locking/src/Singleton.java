import java.util.concurrent.atomic.*;
import java.util.concurrent.locks.*;

/**
 * Expected: thread safe singleton with double checked locking.
 * 
 * @author Yahor Makedon
 */
public final class Singleton {
	private static Singleton instance;
	private static AtomicBoolean isInstanceCreated;
	private static ReentrantLock lock;

	private volatile int count;

	static {
		isInstanceCreated = new AtomicBoolean(false);
		lock = new ReentrantLock();
	}

	private Singleton() {
	}

	public static Singleton getInstance() {
		if (!isInstanceCreated.get()) {
			lock.lock();

			try {
				if (!isInstanceCreated.get()) {
					instance = new Singleton();
					isInstanceCreated.set(true);
				}
			} finally {
				lock.unlock();
			}
		}

		return instance;
	}

	public void increment(int m) {
		lock.lock();

		try {
			for (int i = 0; i < m; i++) {
				count++;
			}
		} finally {
			lock.unlock();
		}
	}

	public int getCount() {
		return count;
	}
}