package pl.gb.edu.codecool.exception;

public class MissingModelException extends Exception {
    public MissingModelException() {
    }

    public MissingModelException(String message) {
        super(message);
    }
}
