public class A {
	public static void main(String[] args) {
		A.B<Integer> b1 = new A().new B<>(0);
		A.B<Double> b2 = new A().new B<>(0d);
		A.B<Byte> b3 = new A().new B<>(Byte.valueOf("0"));

		b1.print();
		b2.print();
		b3.print();
	}

	class B <T extends Number> {
		private T number;

		public B(T number) {
			this.number = number;
		}

		public void print() {
			System.out.println(number.getClass());
		}
	}
}