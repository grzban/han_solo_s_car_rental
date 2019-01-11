package pl.gb.edu.codecool.model.exception;

public class FailureToGetAVehicle extends Exception {
    public FailureToGetAVehicle() {
    }

    public FailureToGetAVehicle(String message) {
        super(message);
    }
}
