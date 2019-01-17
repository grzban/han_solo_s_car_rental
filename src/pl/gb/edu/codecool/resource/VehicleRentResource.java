package pl.gb.edu.codecool.resource;

import pl.gb.edu.codecool.enums.Place;
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
        Vehicle vehicle = null;
        try {
            vehicle = rentedVehicleResource.getVehicleById(vehicleId);

        } catch (VehicleNotExistsException e) {
            System.out.println("There is no vehicle to return!");
        }
        if (vehicle != null) {
            vehicle.setPlace(Place.PARKING);
            rentedVehicleResource.removeVehicle(vehicle);
            availableVehicleResource.addVehicle(vehicle);
        }
    }

    public void rentVehicle(int vehicleId) {
        Vehicle vehicle = null;
        try {
            vehicle = availableVehicleResource.getVehicleById(vehicleId);
        } catch (VehicleNotExistsException e) {
            System.out.println("No vehicle to rent!");
        }
        if (vehicle != null) {
            vehicle.setPlace(Place.RENTED);
            availableVehicleResource.removeVehicle(vehicle);
            rentedVehicleResource.addVehicle(vehicle);
        }
    }

    public void removeVehicle(int vehicleId) {
        Vehicle vehicle = null;
        try {
            vehicle = getAvailableVehicleResource().getVehicleById(vehicleId);
        } catch (VehicleNotExistsException e) {
            System.out.println(e.getMessage());
        }
        if (vehicle != null) {
            getAvailableVehicleResource().removeVehicle(vehicle);
        } else {
            System.out.println("Nie można usunąć pojazdu!");
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
