import java.util.*;
import java.text.*;

/**
 * Expected: gregorian calendar.
 * 
 * @author Yahor Makedon
 */
public class Main {
	public static void main(String[] args) {
		SimpleDateFormat format = new SimpleDateFormat("yyyy MMM dd HH:mm:ss.SSS");
		Calendar calendar = new GregorianCalendar(2018, 5, 25, 8, 20, 10);
		System.out.println(format.format(calendar.getTime()));
	}
}