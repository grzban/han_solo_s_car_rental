package pl.gb.edu.codecool.controller;

import pl.gb.edu.codecool.exception.VehicleNotExistsException;
import pl.gb.edu.codecool.model.Vehicle;
import pl.gb.edu.codecool.resource.VehicleRentResource;
import pl.gb.edu.codecool.view.DetailsVehicleView;

public class DetailsVehicleController {
    private DetailsVehicleView detailsVehicleView;
    private VehicleRentResource vehicleRentResource;

    public DetailsVehicleController(DetailsVehicleView detailsVehicleView, VehicleRentResource vehicleRentResource) {
        this.detailsVehicleView = detailsVehicleView;
        this.vehicleRentResource = vehicleRentResource;
    }

    public void showVehicleDetails(){
        int vehicleId = detailsVehicleView.getVehicleId();
        Vehicle vehicle = null;
        try {
            vehicle = vehicleRentResource.getAvailableVehicleResource().getVehicleById(vehicleId);
        } catch (VehicleNotExistsException e) {
            System.out.println(e.getMessage());
        }
        if (vehicle != null) {
            detailsVehicleView.showVehicleDetails(vehicle);
        } else {
            detailsVehicleView.nothingToShowInfo();
        }
    }
}
