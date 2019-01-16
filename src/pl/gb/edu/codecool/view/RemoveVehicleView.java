package pl.gb.edu.codecool.view;

public class RemoveVehicleView {
    private int vehicleId;

    public RemoveVehicleView() {
        ViewUtil viewUtil = new ViewUtil();
        vehicleId = viewUtil.getIntegerValue();
    }

    public int getVehicleId() {
        return vehicleId;
    }
}
