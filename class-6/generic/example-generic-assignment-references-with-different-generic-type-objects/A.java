public class A {
	class B <T> {
		private T t;
	}

	public static void main(String[] args) {
		A.B<String> b1 = new A().new B<>();
		A.B<Integer> b2 = new A().new B<>();
		b1 = b2;
	} 
}