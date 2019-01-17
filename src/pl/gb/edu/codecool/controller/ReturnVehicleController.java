package pl.gb.edu.codecool.controller;

import pl.gb.edu.codecool.exception.EmptyVehicleListException;
import pl.gb.edu.codecool.resource.VehicleRentResource;
import pl.gb.edu.codecool.view.ReturnVehicleView;

public class ReturnVehicleController {
    private ReturnVehicleView returnVehicleView;
    private VehicleRentResource vehicleRentResource;

    public ReturnVehicleController(ReturnVehicleView returnVehicleView, VehicleRentResource vehicleRentResource) {
        this.returnVehicleView = returnVehicleView;
        this.vehicleRentResource = vehicleRentResource;
    }

    public void returnVehicle() {
        showRentedVehicles();
        int vehicleId = returnVehicleView.getVehicleIdToReturn();
        vehicleRentResource.returnVehicle(vehicleId);
    }

    public void showRentedVehicles() {
        try {
            returnVehicleView.showRentedVehicles(vehicleRentResource.getRentedVehicleResource().getVehicles());
        } catch (EmptyVehicleListException e) {
            System.out.println(e.getMessage());
        }
    }
}
