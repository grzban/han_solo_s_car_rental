package pl.gb.edu.codecool.controller;

import pl.gb.edu.codecool.enums.Place;
import pl.gb.edu.codecool.resource.VehicleRentResource;
import pl.gb.edu.codecool.view.AddVehicleView;
import pl.gb.edu.codecool.view.ReturnVehicleView;
import pl.gb.edu.codecool.view.ViewUtil;

public class ReturnVehicleController {
    private ReturnVehicleView returnVehicleView;
    private VehicleRentResource vehicleRentResource;
    private ViewUtil viewUtil;

    public ReturnVehicleController(ReturnVehicleView returnVehicleView, VehicleRentResource vehicleRentResource) {
        this.returnVehicleView = returnVehicleView;
        this.vehicleRentResource = vehicleRentResource;
        viewUtil = new ViewUtil();
    }

    public void returnVehicle() {
        int vehicleId = viewUtil.getIntegerValue();
        AddVehicleView addVehicleView = new AddVehicleView();
        addVehicleView.showPlaces();
        Place place = addVehicleView.getPlace();
        vehicleRentResource.returnVehicle(vehicleId, place);
    }
}
