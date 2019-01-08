package pl.gb.edu.codecool.model;

import pl.gb.edu.codecool.model.vehicle.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class VehicleRental {
    private List<Vehicle> allVehicles;
    private List<Vehicle> rentedVehicles;
    private List<Vehicle> availableVehicles;

    public VehicleRental() {
        allVehicles = new ArrayList<>();
        rentedVehicles = new ArrayList<>();
        availableVehicles = new ArrayList<>();
    }

    /*
    Move to view
    public List<Vehicle> showAllVehicles(){
        allVehicles.clear();
        allVehicles.addAll(rentedVehicles);
        allVehicles.addAll(availableVehicles);
        return allVehicles;
    }*/

    public List<Vehicle> getRentedVehicles() {
        return rentedVehicles;
    }

    public List<Vehicle> getAvailableVehicles() {
        return availableVehicles;
    }

    public void addVehicle() {

    }

    public void removeVehicle() {

    }

    /*
    Move to view
    public void showVehicleDetails(int vehicleId) {

    }
    */

    public void rentAVehicle(int vehicleId) {

    }

    public void returnTheVehicle(int vehicleId) {

    }


}
