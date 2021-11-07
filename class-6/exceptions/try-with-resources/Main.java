import java.io.*;

/**
 * Expected: try-with-resources.
 * 
 * @author Yahor Makedon
 */
public class Main {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new FileReader("file.txt"))) {
			System.out.println(br.readLine());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}