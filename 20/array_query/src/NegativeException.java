public class NegativeException extends Exception {
    public NegativeException(int x) {
        super(x + " is negative");
    }
}
