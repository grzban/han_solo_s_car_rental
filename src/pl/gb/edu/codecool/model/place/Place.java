package pl.gb.edu.codecool.model.place;

import pl.gb.edu.codecool.model.vehicle.Vehicle;

import java.util.Iterator;
import java.util.List;

public abstract class Place {
    List<Vehicle> vehicleInPlace;

    public void addVehicleToPlace(Vehicle vehicle) {
        vehicleInPlace.add(vehicle);
    }

    public void removeVehicleFromPlace(Vehicle vehicle) {
        vehicleInPlace.remove(vehicle);
    }

    //do widoku
    void showVehiclesInPlace() {
        Iterator vehicles = vehicleInPlace.listIterator();

        while (vehicles.hasNext()) {
            System.out.println(vehicles.next());
        }
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        Iterator vehicles = vehicleInPlace.listIterator();

        int i = 1;
        while (vehicles.hasNext()) {
            result.append(i +"\t" + vehicles.next() + "\n");
            i++;
        }

        return result.toString();
    }
}
