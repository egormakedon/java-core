public class A {
	class B <T> {
		private T t;
	}

	public static void main(String[] args){
		A.B<int> b = new A().new B<>();
	}
}