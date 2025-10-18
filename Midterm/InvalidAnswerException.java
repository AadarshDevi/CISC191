public class InvalidAnswerException extends Exception {

    public InvalidAnswerException() {
        super("The value entered is invalid");
    }

    public InvalidAnswerException(String message) {
        super(message);
    }
}