package pl.gb.edu.codecool.view;

import pl.gb.edu.codecool.model.Vehicle;

import java.util.Iterator;
import java.util.List;

public class AvailableVehiclesView {
    public AvailableVehiclesView() {
        System.out.println("1. lista obecnie dostępnych pojazdów");
    }

    public void showAvailableVehicles(List<Vehicle> vehicles) {
        Iterator<Vehicle> vehicleIterator = vehicles.listIterator();
        while (vehicleIterator.hasNext()) {
            Vehicle vehicle = vehicleIterator.next();
            System.out.println("|\t" +vehicle.getVehicleId() + "\t|\t" + vehicle.getName() + "\t|");
        }
    }
}
