/**
 * Expected: false before intern, true - after.
 * 
 * @author Yahor Makedon
 */
public class Main {
	public static void main(String[] args) {
		String s1 = "Java";
		String s2 = new String("Java");

		System.out.printf("s1(\"Java\") == s2(new String(\"Java\")) - %s [before intern]\n", s1 == s2); 
		s2 = s2.intern();
		System.out.printf("s1(\"Java\") == s2(new String(\"Java\")) - %s [after intern]\n", s1 == s2);
	}
}