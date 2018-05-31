import java.time.*;

public class A {
	public static void main(String[] args) {
		LocalDate d1 = LocalDate.of(2018, Month.JUNE, 25);
		LocalDate d2 = LocalDate.of(2018, 6, 25);

		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d1.equals(d2));
		System.out.println(d1.getMonth());
	}
}