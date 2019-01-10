package pl.gb.edu.codecool.view;

import pl.gb.edu.codecool.model.vehicle.Vehicle;

import java.util.Iterator;
import java.util.List;

public class VehiclesView {

    private Vehicle vehicle;

    public void showVehicles(List<Vehicle> vehicles) {
        Iterator<Vehicle> allVehicles = vehicles.listIterator();
        if (allVehicles.hasNext()) {
            System.out.println("+--------------------------------------------------------------+");

            while (allVehicles.hasNext()) {
                vehicle = allVehicles.next();
                System.out.println("|\t" + vehicle.getVehicleId() + "\t|\t" + vehicle.getName() + "\t|");
                System.out.println("+--------------------------------------------------------------+");
            }
        } else {
            System.out.println("There aren't any vehicles");
        }
    }

    public void showVehicleDetails(Vehicle vehicle) {
        System.out.println("+--------------------------------------------------------------+");
        System.out.println(vehicle.toString());
        System.out.println("+--------------------------------------------------------------+");
    }
}
