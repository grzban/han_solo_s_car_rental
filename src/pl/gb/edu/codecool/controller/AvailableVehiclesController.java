package pl.gb.edu.codecool.controller;

import pl.gb.edu.codecool.exception.EmptyVehicleListException;
import pl.gb.edu.codecool.resource.VehicleRentResource;
import pl.gb.edu.codecool.view.AvailableVehiclesView;

public class AvailableVehiclesController {
    private VehicleRentResource vehicleRentResource;
    private AvailableVehiclesView availableVehiclesView;

    public AvailableVehiclesController(VehicleRentResource vehicleRentResource, AvailableVehiclesView availableVehiclesView) {
        this.vehicleRentResource = vehicleRentResource;
        this.availableVehiclesView = availableVehiclesView;
    }

    public void showAvailableVehicles() {
        try {
            availableVehiclesView.showAvailableVehicles(vehicleRentResource.getAvailableVehicleResource().getVehicles());
        } catch (EmptyVehicleListException e) {
            System.out.println(e.getMessage());
        }
    }
}
