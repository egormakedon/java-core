import java.io.*;

/**
 * Expected: file read, message printed.
 * 
 * @author Yahor Makedon
 */
public class Main {
	public static void main(String[] args) {
		try {
			InputStream in = new FileInputStream("file.txt");

			int i;
			while ((i = in.read()) != -1) {
				System.out.print((char)i);
			}

			System.out.print("\n");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}