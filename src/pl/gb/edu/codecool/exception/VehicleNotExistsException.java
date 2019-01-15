package pl.gb.edu.codecool.exception;

public class VehicleNotExistsException extends Exception {
    public VehicleNotExistsException() {
    }

    public VehicleNotExistsException(String message) {
        super(message);
    }
}
