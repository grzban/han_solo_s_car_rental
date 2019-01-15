package pl.gb.edu.codecool.resource;

import pl.gb.edu.codecool.exception.VehicleNotExistsException;
import pl.gb.edu.codecool.model.Vehicle;

public class VehicleRentResource {
    AvailableVehicleResource availableVehicleResource;
    RentedVehicleResource rentedVehicleResource;

    public VehicleRentResource() {
        availableVehicleResource = new AvailableVehicleResource();
        rentedVehicleResource = new RentedVehicleResource();
    }

    public void returnVehicle(int vehicleId) {
        try {
            Vehicle vehicle = rentedVehicleResource.getVehicleById(vehicleId);
            rentedVehicleResource.removeVehicle(vehicle);
            availableVehicleResource.addVehicle(vehicle);
        } catch (VehicleNotExistsException e) {
            System.out.println("There is no vehicle to return!");
        }
    }

    public void rentVehicle(int vehicleId) {
        try {
            Vehicle vehicle = availableVehicleResource.getVehicleById(vehicleId);
            availableVehicleResource.removeVehicle(vehicle);
            rentedVehicleResource.addVehicle(vehicle);
        } catch (VehicleNotExistsException e) {
            System.out.println("There is no vehicle to rent!");
        }
    }

    public AvailableVehicleResource getAvailableVehicleResource() {
        return availableVehicleResource;
    }

    public RentedVehicleResource getRentedVehicleResource() {
        return rentedVehicleResource;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("Available vehicles");
        result.append("\n");
        result.append(availableVehicleResource);
        result.append("\n");
        result.append("Rented vehicles");
        result.append("\n");
        result.append(rentedVehicleResource);
        return result.toString();
    }
}