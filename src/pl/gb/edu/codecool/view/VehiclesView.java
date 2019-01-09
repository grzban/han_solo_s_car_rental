package pl.gb.edu.codecool.view;

import pl.gb.edu.codecool.model.vehicle.Vehicle;

import java.util.Iterator;
import java.util.List;

public class VehiclesView {

    private Vehicle vehicle;

    public void showVehicles(List<Vehicle> vehicles) {
        Iterator allVehicles = vehicles.listIterator();
        if (allVehicles.hasNext()) {
            System.out.println("+--------------------------------------------------------------+");

            while (allVehicles.hasNext()) {
                vehicle = (Vehicle) allVehicles.next();
                System.out.println("|\t" + vehicle.getVehicleId() + "\t|\t" + vehicle.getName() + "\t|");
                System.out.println("+--------------------------------------------------------------+");
            }
        } else {
            System.out.println("There aren't any vehicles");
        }
    }

    public void showVehicleDetails(int vehicleId, List<Vehicle> vehicles) {
        Iterator allVehicles = vehicles.listIterator();
        if (allVehicles.hasNext()) {
            while (allVehicles.hasNext()) {
                vehicle = (Vehicle) allVehicles.next();
                if (vehicle.getVehicleId() == vehicleId) {
                    System.out.println("+--------------------------------------------------------------+");
                    System.out.println(vehicle.toString());
                    System.out.println("+--------------------------------------------------------------+");
                } else {
                    System.out.println("Vehicle does't exist.");
                }
            }
        } else {
            System.out.println("I can't show you any details. The vehicle doesn't exist");
        }
    }
}
