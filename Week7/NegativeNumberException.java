package week_7;

public class NegativeNumberException extends Exception {
    public NegativeNumberException() {
        super("Number cannot be less than 0.");
    }
}
