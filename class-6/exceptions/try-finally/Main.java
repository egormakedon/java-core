/**
 * Expected: try-finally.
 * 
 * @author Yahor Makedon
 */
public class Main {
	public static void main(String[] args) {
		try {
			System.out.println("try [before return]");
			return;
		} finally {
			System.out.println("finally [after return]");
		}
	}
}