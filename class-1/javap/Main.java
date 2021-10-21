/**
 * Expected: compiled and disassembled successfully.
 * 
 * @author Yahor Makedon
 */
public class Main {
	private static String message = "Hello, world!";

	static {
		System.out.println("Static init block");
	}

	{
		System.out.println("Non-static init block");
	}

	public Main() {
		System.out.println("Default constructor");
	}

	public static void main(String[] args) {
		new Main();
		System.out.println(message);
	}
}