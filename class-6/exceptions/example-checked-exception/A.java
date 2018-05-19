import java.io.*;

public class A {
	public static void main(String[] args) {
		try {
			InputStream in = new FileInputStream("file.txt");
			System.out.println(in.read());
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}