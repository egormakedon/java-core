import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        throw UncheckedThrow.throwUnchecked(new IOException());
    }
}