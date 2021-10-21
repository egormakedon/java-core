import org.apache.log4j.Logger;

import java.io.File;

/**
 * Expected: print loaded library name.
 * 
 * @author Yahor Makedon
 */
public class Main {
	public static void main(String[] args) {
		String[] splitPath = Logger.class.getProtectionDomain().getCodeSource().getLocation().getPath().split(File.separator);
		System.out.println(splitPath[splitPath.length - 1]);
	}
}