import java.util.*;
import java.text.*;

public class A {
	public static void main(String[] args) {
		SimpleDateFormat format = new SimpleDateFormat("yyyy MMM dd HH:mm:ss");	
		Calendar calendar = new GregorianCalendar(2018,5,25,8,20,10);
		System.out.println(format.format(calendar.getTime()));
	}
}