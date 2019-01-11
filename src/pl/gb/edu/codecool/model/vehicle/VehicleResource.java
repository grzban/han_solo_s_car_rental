package pl.gb.edu.codecool.model.vehicle;

import java.util.ArrayList;
import java.util.List;

public class VehicleResource {
    private List<Vehicle> availableVehicles;
    private List<Vehicle> rentedVehicles;

    public VehicleResource() {
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

    public void returnOfTheVehicle(int vehicleId) {
        try {
            Vehicle vehicle = getVehicleById(vehicleId, getRentedVehicles());
            getRentedVehicles().remove(vehicle);
            getAvailableVehicles().add(vehicle);
        } catch (NullPointerException e) {
            System.out.println("Nie można zwrócić pojazdu");
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

    public Vehicle getVehicleDetails(int vehicleId, List<Vehicle> vehiclesList) {
        try {
            return getVehicleById(vehicleId, vehiclesList);
        } catch (NullPointerException e) {
            System.out.println("The vehicle isn't available.");
        }
        throw new NullPointerException();
    }

    private Vehicle getVehicleById(int vehicleId, List<Vehicle> vehiclesList) {
        for (Vehicle vehicle : vehiclesList) {
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
