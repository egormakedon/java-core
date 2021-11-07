/**
 * Expected: java.lang.NumberFormatException: For input string: "0.1".
 * 
 * @author Yahor Makedon
 */
public class Main {
	public static void main(String[] args) {
		Integer i = new Integer("0.1");
	}
}