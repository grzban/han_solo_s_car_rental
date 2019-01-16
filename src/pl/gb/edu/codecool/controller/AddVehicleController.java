package pl.gb.edu.codecool.controller;

import pl.gb.edu.codecool.enums.Model;
import pl.gb.edu.codecool.enums.Place;
import pl.gb.edu.codecool.enums.Type;
import pl.gb.edu.codecool.model.Vehicle;
import pl.gb.edu.codecool.resource.VehicleRentResource;
import pl.gb.edu.codecool.view.AddVehicleView;

import java.time.LocalDate;

public class AddVehicleController {
    private AddVehicleView addVehicleView;
    private VehicleRentResource vehicleRentResource;
    private Vehicle vehicle;

    public AddVehicleController(AddVehicleView addVehicleView, VehicleRentResource vehicleRentResource) {
        this.addVehicleView = addVehicleView;
        this.vehicleRentResource = vehicleRentResource;
        getDateOfProduction();
        vehicle = new Vehicle(4, getVehicleName(), getModel(), getDateOfProduction(), getMileageOfTheVehicle(), getType(), getAmountOfFuel(), getPlace());
        addVehicle(vehicle);
    }

    private int getId() {
        return 0;
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

    public void addVehicle(Vehicle vehicle) {
        vehicleRentResource.getAvailableVehicleResource().addVehicle(vehicle);
    }
}
