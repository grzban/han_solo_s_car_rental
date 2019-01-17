package pl.gb.edu.codecool.view;

import pl.gb.edu.codecool.model.Vehicle;

import java.util.Iterator;
import java.util.List;

public class RentVehicleView {

    private ViewUtil viewUtil;

    public RentVehicleView() {
        viewUtil = new ViewUtil();
        System.out.println("5. wypożyczanie pojazdu");
    }

    public int getVehicleId() {
        int vehicleId = viewUtil.getIntegerValue();
        return vehicleId;
    }

    public void showRentedVehicles(List<Vehicle> vehicles) {
        Iterator<Vehicle> vehicleIterator = vehicles.listIterator();
        while (vehicleIterator.hasNext()) {
            Vehicle vehicle = vehicleIterator.next();
            System.out.println("|\t" +vehicle.getVehicleId() + "\t|\t" + vehicle.getName() + "\t|");
        }
    }
}
