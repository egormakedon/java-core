public final class UncheckedThrow {
    private UncheckedThrow(){}

    public static RuntimeException throwUnchecked(final Exception ex) {
        UncheckedThrow.<RuntimeException>throwsUnchecked(ex);
        throw new AssertionError("This code should be unreachable. Something went terrible wrong here!");
    }

    private static <T extends Exception> void throwsUnchecked(Exception ex) throws T {
        throw (T) ex;
    }
}