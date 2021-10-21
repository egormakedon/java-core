/**
 * Expected: thrown exception from init block.
 * 
 * @author Yahor Makedon
 */
public class Main {
	{
		if (false) {
		} else {
			throw new RuntimeException("Exception from init block.");
		}
	}

	public static void main(String[] args) {
		new Main();
	}
}