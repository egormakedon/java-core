import java.io.IOException;

/**
 * Expected: checked exception thrown like unchecked.
 * 
 * @author Yahor Makedon
 */
public class Main {
	public static void main(String[] args) {
		throw UncheckedThrow.throwUnchecked(new IOException());
	}
}