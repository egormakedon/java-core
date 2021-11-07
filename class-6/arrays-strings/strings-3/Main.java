/**
 * Expected: different results equal strings by == and equals.
 * 
 * @author Yahor Makedon
 */
public class Main {
	public static void main(String[] args) {
		String s1 = "Java";
		String s2 = "Java";
		String s3 = new String("Java");
		String s4 = new String(s1);

		System.out.printf("s1(\"Java\") == s2(\"Java\") - %s\n", s1 == s2);
		System.out.printf("s3(new String(\"Java\")) == s4(new String(s1)) - %s\n", s3 == s4);
		System.out.printf("s1(\"Java\") == s3(new String(\"Java\")) - %s\n", s1 == s3);
		System.out.printf("s1(\"Java\") equals s2(\"Java\") - %s\n", s1.equals(s2));
		System.out.printf("s1(\"Java\") equals s3(new String(\"Java\")) - %s\n", s1.equals(s3));
	}
}	