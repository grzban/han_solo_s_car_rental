package pl.gb.edu.codecool.controller;

import pl.gb.edu.codecool.resource.VehicleRentResource;
import pl.gb.edu.codecool.view.RemoveVehicleView;
import pl.gb.edu.codecool.view.ViewUtil;

public class RemoveVehicleController {

    private RemoveVehicleView removeVehicleView;
    private VehicleRentResource vehicleRentResource;
    private ViewUtil viewUtil;

    public RemoveVehicleController(RemoveVehicleView removeVehicleView, VehicleRentResource vehicleRentResource) {
        this.removeVehicleView = removeVehicleView;
        this.vehicleRentResource = vehicleRentResource;
        viewUtil = new ViewUtil();
    }

    public void removeVehicle() {
        vehicleRentResource.removeVehicle(removeVehicleView.getVehicleId());
    }
}
