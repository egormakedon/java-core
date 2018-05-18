public class A {

	public static void main(String[] args) {
		A.B<String,Integer> b = new A().new B<>();
		b.setT1("Hello, World!");
		b.setT2(42);
		b.print();
	}

	class B <T1,T2 extends Number> {
		private T1 t1;
		private T2 t2;

		public void setT1(T1 t1) {
			this.t1 = t1;
		}

		public void setT2(T2 t2) {
			this.t2 = t2;
		}

		public void print() {
			System.out.println("T1 parameter (" + t1.getClass() + ") - " + t1.toString());
			System.out.println("T2 parameter (" + t2.getClass() + ") - " + t2);
		}
	}
}