package pl.gb.edu.codecool.exception;

public class EmptyVehicleListException extends Exception {

    public EmptyVehicleListException() {
    }

    public EmptyVehicleListException(String message) {
        super(message);
    }
}
