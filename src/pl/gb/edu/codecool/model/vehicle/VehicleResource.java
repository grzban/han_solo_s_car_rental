package pl.gb.edu.codecool.model.vehicle;

import pl.gb.edu.codecool.model.enums.Place;
import pl.gb.edu.codecool.model.exception.FailureToGetAVehicle;

import java.util.ArrayList;
import java.util.List;

public class VehicleResource {

    private List<Vehicle> availableVehicles;
    private List<Vehicle> rentedVehicles;
    private Vehicle vehicle;

    public VehicleResource() {
        availableVehicles = new ArrayList<>();
        rentedVehicles = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle, Place place) {
        vehicle.setPlace(place);
        availableVehicles.add(vehicle);
    }

    public void removeVehicle(int vehicleId) throws FailureToGetAVehicle {
        vehicle = getVehicleById(vehicleId, availableVehicles);
        if (vehicle != null) {
            availableVehicles.remove(vehicle);
        } else {
            throw new FailureToGetAVehicle("Missing vehicle to remove");
        }
    }

    public void returnTheVehicle(int vehicleId, Place place) throws FailureToGetAVehicle {
        vehicle = getVehicleById(vehicleId, rentedVehicles);
        if (vehicle != null) {
            rentedVehicles.remove(vehicle);
            vehicle.setPlace(place);
            availableVehicles.add(vehicle);
        } else {
            throw new FailureToGetAVehicle("Missing vehicle to return");
        }
    }

    public void rentTheVehicle(int vehicleId) throws FailureToGetAVehicle {
        vehicle = getVehicleById(vehicleId, availableVehicles);
        if (vehicle != null) {
            availableVehicles.remove(vehicle);
            vehicle.setPlace(Place.RENTED);
            rentedVehicles.add(vehicle);
        } else {
            throw new FailureToGetAVehicle("Missing vehicle to rent");
        }
    }

    public Vehicle getVehicleById(int vehicleId, List<Vehicle> vehicles) {
        for (Vehicle v : vehicles) {
            if (v.getVehicleId() == vehicleId) {
                vehicle = v;
            }
        }
        return vehicle;
    }

    public List<Vehicle> getAvailableVehicles() {
        return availableVehicles;
    }

    public List<Vehicle> getRentedVehicles() {
        return rentedVehicles;
    }
}