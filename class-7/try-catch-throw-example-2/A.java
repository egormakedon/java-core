import java.io.IOException;

public class A {
	public static void main(String[] args) {
		try {
			throw new IOException();
		} catch(IOException | RuntimeException e) {
			e = new RuntimeException();
			e.printStackTrace();
		}
	}
}