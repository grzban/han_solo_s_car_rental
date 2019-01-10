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

    public void removeVehicle(int vehicleId) {

        try {
            Vehicle vehicle = getVehicleById(vehicleId, getAvailableVehicles());
            availableVehicles.remove(vehicle);
        } catch (NullPointerException e) {
            System.out.println("Nothing to remove");
        }

    }

    public void rentTheVehicle(int vehicleId) {
        try {
            Vehicle vehicle = getVehicleById(vehicleId, getAvailableVehicles());
            availableVehicles.remove(vehicle);
            rentedVehicles.add(vehicle);
        } catch (NullPointerException e) {
            System.out.println("Nothing to rent");
        }
    }

    public Vehicle getVehicleDetails(int vehicleId, List<Vehicle> vehiclesList){
        try {
            Vehicle vehicle = getVehicleById(vehicleId, vehiclesList);
            return vehicle;
        } catch (NullPointerException e) {
            System.out.println("The vehicle isn't available.");
        }
        System.out.println("Coś się pojawi?????");
        return null;
    }


    private Vehicle getVehicleById(int vehicleId, List<Vehicle> vehiclesList) {
        Iterator<Vehicle> vehicles = vehiclesList.listIterator();
        while (vehicles.hasNext()) {
            Vehicle vehicle = vehicles.next();
            if (vehicle.getVehicleId() == vehicleId) {
                return vehicle;
            }
        }
        throw new NullPointerException();
    }

    public List<Vehicle> getAvailableVehicles() {
        return availableVehicles;
    }

    public List<Vehicle> getRentedVehicles() {
        return rentedVehicles;
    }
}
