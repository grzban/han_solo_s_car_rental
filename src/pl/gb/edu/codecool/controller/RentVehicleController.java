package pl.gb.edu.codecool.controller;

import pl.gb.edu.codecool.resource.VehicleRentResource;
import pl.gb.edu.codecool.view.RentVehicleView;

public class RentVehicleController {
    private RentVehicleView rentVehicleView;
    private VehicleRentResource vehicleRentResource;

    public RentVehicleController(RentVehicleView rentVehicleView, VehicleRentResource vehicleRentResource) {
        this.rentVehicleView = rentVehicleView;
        this.vehicleRentResource = vehicleRentResource;
    }

    public void rentVehicle() {

    }
}
