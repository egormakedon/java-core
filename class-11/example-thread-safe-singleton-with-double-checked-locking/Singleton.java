import java.util.concurrent.atomic.*;
import java.util.concurrent.locks.*;

public class Singleton {
	private static Singleton instance;
	private static AtomicBoolean instanceCreated;
	private static ReentrantLock lock;

	private volatile int count;

	static {
		instanceCreated = new AtomicBoolean(false);
		lock = new ReentrantLock();
	}

	private Singleton() {}

	public static Singleton getInstance() {
		if (!instanceCreated.get()) {
			lock.lock();
			try {
				if (!instanceCreated.get()) {
					instance = new Singleton();
					instanceCreated.set(true);
				}
			} finally {
				lock.unlock();
			}
		}
		return instance;
	}

	public synchronized void increment() {
		for (int i = 0; i < 10; i++) {
			count++;
		}
	}

	public int getCount() {
		return count;
	}
}