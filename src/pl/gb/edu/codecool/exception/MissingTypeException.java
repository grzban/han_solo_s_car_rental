package pl.gb.edu.codecool.exception;

public class MissingTypeException extends Exception {
    public MissingTypeException() {
    }

    public MissingTypeException(String message) {
        super(message);
    }
}
