package pl.gb.edu.codecool.controller;

import pl.gb.edu.codecool.exception.EmptyVehicleListException;
import pl.gb.edu.codecool.resource.VehicleRentResource;
import pl.gb.edu.codecool.view.RemoveVehicleView;

public class RemoveVehicleController {

    private RemoveVehicleView removeVehicleView;
    private VehicleRentResource vehicleRentResource;

    public RemoveVehicleController(RemoveVehicleView removeVehicleView, VehicleRentResource vehicleRentResource) {
        this.removeVehicleView = removeVehicleView;
        this.vehicleRentResource = vehicleRentResource;
    }

    public void removeVehicle() {
        try {
            removeVehicleView.showVehicles(vehicleRentResource.getAvailableVehicleResource().getVehicles());
        } catch (EmptyVehicleListException e) {
            System.out.println(e.getMessage());
        }
        vehicleRentResource.removeVehicle(removeVehicleView.getRemoveVehicleId());
    }
}
