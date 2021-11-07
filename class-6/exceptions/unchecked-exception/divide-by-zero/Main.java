/**
 * Expected: java.lang.ArithmeticException: / by zero.
 * 
 * @author Yahor Makedon
 */
public class Main {
	public static void main(String[] args) {
		int i = 10;
		System.out.println(i / 0);
	}
}