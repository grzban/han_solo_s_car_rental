package pl.gb.edu.codecool.controller;

import pl.gb.edu.codecool.enums.Model;
import pl.gb.edu.codecool.enums.Place;
import pl.gb.edu.codecool.enums.Type;
import pl.gb.edu.codecool.exception.EmptyVehicleListException;
import pl.gb.edu.codecool.model.Vehicle;
import pl.gb.edu.codecool.resource.VehicleRentResource;
import pl.gb.edu.codecool.view.AddVehicleView;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AddVehicleController {
    private AddVehicleView addVehicleView;
    private VehicleRentResource vehicleRentResource;

    public AddVehicleController(AddVehicleView addVehicleView, VehicleRentResource vehicleRentResource) {
        this.addVehicleView = addVehicleView;
        this.vehicleRentResource = vehicleRentResource;
    }

    public void addVehicle() {
        Vehicle vehicle = new Vehicle(generateVehicleId(), getVehicleName(), getModel(), getDateOfProduction(), getMileageOfTheVehicle(), getType(), getAmountOfFuel(), getPlace());
        addVehicle(vehicle);
    }

    private int generateVehicleId() {

        List<Integer> actualUsedIds = new ArrayList<>();
        try {
            actualUsedIds.addAll(getIdsFromVehiclesList(vehicleRentResource.getAvailableVehicleResource().getVehicles()));
        } catch (EmptyVehicleListException e) {
            System.out.println("Brak pojazdów w wypożyczalni");
        }
        try {
            actualUsedIds.addAll(getIdsFromVehiclesList(vehicleRentResource.getRentedVehicleResource().getVehicles()));
        } catch (EmptyVehicleListException e) {
            System.out.println("Nie ma pojazdów wypożyczonych");
        }

        int id = Collections.max(actualUsedIds) + 1;
        return id;
    }

    private List<Integer> getIdsFromVehiclesList(List<Vehicle> vehicles) {
        List<Integer> ids = new ArrayList<>();
        for (Vehicle vehicle : vehicles) {
            ids.add(vehicle.getVehicleId());
        }
        return ids;
    }

    private String getVehicleName() {
        return addVehicleView.getName();
    }

    private Model getModel() {
        return addVehicleView.getModel();
    }

    private LocalDate getDateOfProduction() {
        return addVehicleView.getDateOfProduction();
    }

    private int getMileageOfTheVehicle() {
        return addVehicleView.getMileageOfTheVehicle();
    }

    private Type getType() {
        return addVehicleView.getType();
    }

    private int getAmountOfFuel() {
        return addVehicleView.getAmountOfFuel();
    }

    private Place getPlace() {
        return addVehicleView.getPlace();
    }

    private void addVehicle(Vehicle vehicle) {
        vehicleRentResource.getAvailableVehicleResource().addVehicle(vehicle);
    }
}
