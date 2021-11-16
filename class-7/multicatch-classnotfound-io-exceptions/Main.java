import java.io.*;

/**
 * Expected: Alternatives in a multi-catch statement cannot be related by subclassing.
 * 
 * @author Yahor Makedon
 */
public class Main {
	public static void main(String[] args) {
		try {
			InputStream in = new FileInputStream("file.txt");
		} catch (FileNotFoundException | IOException e) {
			e.printStackTrace();
		}
	}
}