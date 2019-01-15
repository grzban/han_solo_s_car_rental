package pl.gb.edu.codecool.resource;

import pl.gb.edu.codecool.exception.EmptyVehicleListException;
import pl.gb.edu.codecool.exception.VehicleNotExistsException;
import pl.gb.edu.codecool.model.Vehicle;

import java.util.List;

public abstract class VehicleResource {
    List<Vehicle> vehicles;

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    public void removeVehicle(Vehicle vehicle) {
        vehicles.remove(vehicle);
    }

    public Vehicle getVehicleById(int vehicleId) throws VehicleNotExistsException {
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getVehicleId() == vehicleId) {
                return vehicle;
            }
        }
        throw new VehicleNotExistsException("There isn't vehicle that you want");
    }

    public List<Vehicle> getVehicles() throws EmptyVehicleListException {
        if (vehicles.isEmpty()) {
            throw new EmptyVehicleListException("There is nothing in vehicle rental");
        }
        return vehicles;
    }

    @Override
    public String toString() {
        return vehicles.toString() ;
    }
}
