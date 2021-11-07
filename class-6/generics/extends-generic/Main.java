/**
 * Expected: printed different created generic objects.
 * 
 * @author Yahor Makedon
 */
public class Main {
	public static void main(String[] args) {
		Main.A<Integer> a1 = new Main.A<>(Integer.valueOf("0"));
		Main.A<Double> a2 = new Main.A<>(Double.valueOf("1"));
		Main.A<Byte> a3 = new Main.A<>(Byte.valueOf("2"));
		Main.A<Long> a4 = new Main.A<>(Long.valueOf("3"));
		Main.A<Short> a5 = new Main.A<>(Short.valueOf("4"));

		a1.print();
		a2.print();
		a3.print();
		a4.print();
		a5.print();
	}

	private static class A <T extends Number> {
		private T number;

		public A(T number) {
			this.number = number;
		}

		public void print() {
			System.out.printf("%s - %s\n", number.getClass(), number);
		}
	}
}