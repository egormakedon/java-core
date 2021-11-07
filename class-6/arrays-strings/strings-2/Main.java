/**
 * Expected: Java. New string "Java Certified" was created inside method, but reference wasn't updated.
 * 
 * @author Yahor Makedon
 */
public class Main {
	public static void main(String[] args) {
		String s = new String("Java");
		changeStr(s);
		System.out.println(s);
	}

	private static void changeStr(String s) {
		s = s.concat(" Certified");
	}
}