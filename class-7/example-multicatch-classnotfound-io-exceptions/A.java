import java.io.*;

public class A {
	public static void main(String[] args) {
		try {
			InputStream in = new FileInputStream("test-file.txt");
			System.out.println(in.read());
		} catch (FileNotFoundException | IOException e) {
			e.printStackTrace();
		}
	}
}