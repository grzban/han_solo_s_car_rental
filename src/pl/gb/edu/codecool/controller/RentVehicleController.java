package pl.gb.edu.codecool.controller;

import pl.gb.edu.codecool.exception.EmptyVehicleListException;
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
        vehicleRentResource.rentVehicle(rentVehicleView.getVehicleIdToRent());
    }

    public void showRentedVehicles() {
        try {
            rentVehicleView.showRentedVehicles(vehicleRentResource.getRentedVehicleResource().getVehicles());
        } catch (EmptyVehicleListException e) {
            System.out.println(e.getMessage());
        }
    }

    public void showVehiclesToRent() {
        try {
            rentVehicleView.showVehiclesToRent(vehicleRentResource.getAvailableVehicleResource().getVehicles());
        } catch (EmptyVehicleListException e) {
            System.out.println(e.getMessage());
        }
    }
}
