package pl.gb.edu.codecool.model.vehicle;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Vehicles {
    private List<Vehicle> availableVehicles;
    private List<Vehicle> rentedVehicles;

    public Vehicles() {
        availableVehicles = new ArrayList();
        rentedVehicles = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle) {
        availableVehicles.add(vehicle);
    }

    public Vehicle removeVehicle(int vehicleId) throws NullPointerException {
        Iterator<Vehicle> vehicles = availableVehicles.listIterator();
        while (vehicles.hasNext()) {
            Vehicle vehicle = vehicles.next();
            if (vehicle.getVehicleId() == vehicleId) {
                availableVehicles.remove(vehicle);
                return vehicle;
            }
        }
        return null;
    }

    public void rentTheVehicle(int vehicleId) {
        try {
            removeVehicle(vehicleId);
        } catch (NullPointerException e) {
            System.out.println("Nothing to rent");
        }
    }

    public List<Vehicle> getAvailableVehicles() {
        return availableVehicles;
    }
}
