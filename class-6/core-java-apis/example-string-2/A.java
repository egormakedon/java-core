public class A {
	public static void main(String[] args) {
		String str = new String("Java");
		changeStr(str);
		System.out.println(str);
	}

	private static void changeStr(String s) {
		s = s.concat(" Certified");
	}
}