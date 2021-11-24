/**
 * Expected: some examples of substring.
 * 
 * @author Yahor Makedon
 */
public class Main {
	public static void main(String[] args) {
		String s = "some";

		System.out.printf("substring(3, 3) of \"%s\" - \"%s\"\n", s, s.substring(3, 3));
		System.out.printf("substring(3, 4) of \"%s\" - \"%s\"\n", s, s.substring(3, 4));

		try {
			s.substring(3, 2);
		} catch (Exception e) {
			System.out.printf("substring(3, 2) of \"%s\" - \"%s\"\n", s, e.getMessage());
		} 
	}
}