package pl.gb.edu.codecool.view;

import pl.gb.edu.codecool.model.Vehicle;

public class RentVehicleView {

    private ViewUtil viewUtil;

    public RentVehicleView() {
        viewUtil = new ViewUtil();
    }

    public int getVehicleId() {
        int vehicleId = viewUtil.getIntegerValue();
        return vehicleId;
    }

    public void rentVehicle(Vehicle vehicle) {

    }
}
