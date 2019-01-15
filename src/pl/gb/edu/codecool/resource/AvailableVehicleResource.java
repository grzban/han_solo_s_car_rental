package pl.gb.edu.codecool.resource;

import java.util.ArrayList;

public class AvailableVehicleResource extends VehicleResource {

    public AvailableVehicleResource() {
        vehicles = new ArrayList<>();
    }

    /*public void returnVehicle(int vehicleId) {
        addVehicle();
    }*/

    /*public void rentVehicle(int vehicleId) {

    }*/
    /*public void addVehicle(Vehicle vehicle, Place place) {
        vehicle.setPlace(place);
        availableVehicles.add(vehicle);
    }

    public void removeVehicle(int vehicleId) throws VehicleNotExistsException {
        vehicle = getVehicleById(vehicleId, availableVehicles);
        if (vehicle != null) {
            availableVehicles.remove(vehicle);
        } else {
            throw new VehicleNotExistsException("Missing vehicle to remove");
        }
    }

    public void returnTheVehicle(int vehicleId, Place place) throws VehicleNotExistsException {
        vehicle = getVehicleById(vehicleId, rentedVehicles);
        if (vehicle != null) {
            rentedVehicles.remove(vehicle);
            vehicle.setPlace(place);
            availableVehicles.add(vehicle);
        } else {
            throw new VehicleNotExistsException("Missing vehicle to return");
        }
    }

    public void rentTheVehicle(int vehicleId) throws VehicleNotExistsException {
        vehicle = getVehicleById(vehicleId, availableVehicles);
        if (vehicle != null) {
            availableVehicles.remove(vehicle);
            vehicle.setPlace(Place.RENTED);
            rentedVehicles.add(vehicle);
        } else {
            throw new VehicleNotExistsException("Missing vehicle to rent");
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

    public Vehicle getAvailableVehicleById(int vehicleId) throws VehicleNotExistsException {
        Vehicle vehicle = getVehicleById(vehicleId, getAvailableVehicles());
        if (vehicle != null ) {
            return vehicle;
        } else {
            throw new VehicleNotExistsException("Missing vehicle. I can't show details");
        }
    }

    public List<Vehicle> getAvailableVehicles() {
        return availableVehicles;
    }

    public List<Vehicle> getRentedVehicles() {
        return rentedVehicles;
    }*/

}