import java.io.*;

public class A {
	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new FileReader("file.txt"))) {
			System.out.println(br.readLine());
		} catch(Exception e) {
			e.printStackTrace();
		}
	} 
}