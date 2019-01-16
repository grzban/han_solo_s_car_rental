package pl.gb.edu.codecool.resource;

import java.util.ArrayList;

public class AvailableVehicleResource extends VehicleResource {

    public AvailableVehicleResource() {
        vehicles = new ArrayList<>();
    }

   /*
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