/**
 * Expected: checked exception thrown like unchecked.
 * 
 * @author Yahor Makedon
 */
public final class UncheckedThrow {
	private UncheckedThrow() {
	}

	public static RuntimeException throwUnchecked(final Exception e) {
		UncheckedThrow.<RuntimeException>throwsUnchecked(e);
		throw new AssertionError("This code should be unreachable. Something went terrible wrong here!");
	}

	private static <T extends Exception> void throwsUnchecked(Exception e) throws T {
		throw (T) e;
	}
}