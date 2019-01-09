package pl.gb.edu.codecool.controller;

import pl.gb.edu.codecool.model.enums.Model;
import pl.gb.edu.codecool.model.enums.Type;
import pl.gb.edu.codecool.model.enums.VehicleState;
import pl.gb.edu.codecool.model.vehicle.Vehicles;
import pl.gb.edu.codecool.model.vehicle.Vehicle;
import pl.gb.edu.codecool.view.VehiclesView;

import java.util.Date;
import java.util.Scanner;

public class VehiclesController {

    private Vehicles vehicles;
    private VehiclesView vehiclesView;

    public VehiclesController(Vehicles vehicles, VehiclesView vehiclesView) {
        this.vehicles = vehicles;
        this.vehiclesView = vehiclesView;
        exampleVehicles();
    }

    public void showAvailableVehicles() {
        vehiclesView.showVehicles(vehicles.getAvailableVehicles());
    }

    public void removeVehicle() {
        System.out.println("Który pojazd chcesz usunąć");

        Scanner scanner = new Scanner(System.in);
        int vehicleId = scanner.nextInt();
        vehicles.removeVehicle(vehicleId);
    }

    public void showVehicleDetails() {
        Scanner scanner = new Scanner(System.in);
        int vehicleId = scanner.nextInt();
        vehiclesView.showVehicleDetails(vehicleId, vehicles.getAvailableVehicles());
    }

    public void exampleVehicles() {
        Vehicle vehicle = new Vehicle();
        vehicle.setVehicleId(1);
        vehicle.setModel(Model.MODEL_1);
        vehicle.setName("Vehicle 1");
        vehicle.setVehicleType(Type.FLYING_FIGHTER);
        vehicle.setMileageOfTheVehicle(3000);
        vehicle.setAmountOfFuel(100);
        vehicle.setDateOfProduction(new Date(1287784800000l));
        vehicle.setState(VehicleState.AVAILABLE_EXHIBITION);

        vehicles.addVehicle(vehicle);

        vehicle = new Vehicle();
        vehicle.setVehicleId(2);
        vehicle.setModel(Model.MODEL_2);
        vehicle.setName("Vehicle 2");
        vehicle.setVehicleType(Type.FLYING_TROOP_SHIP);
        vehicle.setMileageOfTheVehicle(5000);
        vehicle.setAmountOfFuel(1000);
        vehicle.setDateOfProduction(new Date(1287794800000l));
        vehicle.setState(VehicleState.AVAILABLE_PARKING);

        vehicles.addVehicle(vehicle);
    }
}