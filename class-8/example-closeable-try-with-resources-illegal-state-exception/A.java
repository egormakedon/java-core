import java.io.Closeable;

public class A implements Closeable {
	public void print() {
		System.out.println("A class - print method");
	}

	@Override
	public void close() throws IllegalStateException {
		throw new IllegalStateException("A class - IllegalStateException");
	}
}