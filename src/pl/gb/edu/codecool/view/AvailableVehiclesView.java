package pl.gb.edu.codecool.view;

import pl.gb.edu.codecool.model.Vehicle;

import java.util.Iterator;
import java.util.List;

public class AvailableVehiclesView {
    public void showAvailableVehicles(List<Vehicle> vehicles) {
        Iterator<Vehicle> vehicleIterator = vehicles.listIterator();
        while (vehicleIterator.hasNext()) {
            Vehicle vehicle = vehicleIterator.next();
            System.out.println(vehicle.toString());
        }
    }
}
