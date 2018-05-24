public class A {
	public static void main(String[] args) {
		String s = "some";
		System.out.println("input string - \"some\"");

		System.out.println("Result (3,3) - " + s.substring(3,3));
		System.out.println("Result (3,4) - " + s.substring(3,4));
		
		try {
			s.substring(3,2);
		} catch(Exception e) {
			System.out.println("Result (3,2) - " + e.getMessage());
		} 
	}
}