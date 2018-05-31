import java.util.Date;
import java.text.*;

public class A {
	public static void main(String[] args) {
		Date d1 = new Date();
		Date d2 = new Date(2018, 6, 1);
		Date d3 = new Date(d1.getTime());
		Date d4 = new Date(2000000000L);

		DateFormat format = new SimpleDateFormat("yyyy-MM-dd");

		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		System.out.println(d4);
		System.out.println(format.format(d1));

	}
}