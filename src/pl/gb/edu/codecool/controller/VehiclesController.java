package pl.gb.edu.codecool.controller;

import pl.gb.edu.codecool.model.enums.Models;
import pl.gb.edu.codecool.model.enums.Type;
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

    public void showRentedVehicles() {
        vehiclesView.showVehicles(vehicles.getRentedVehicles());
    }

    public void removeVehicle() {
        vehicles.removeVehicle(getUserChoice("Który pojazd chcesz usunąć?"));
        showAvailableVehicles();
    }

    public void rentTheVehicle() {
        vehicles.rentTheVehicle(getUserChoice("Który pojazd chcesz wypożyczyć?"));
        showRentedVehicles();
    }


    public int getUserChoice(String message) {
        System.out.println(message);

        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                int vehicleId = Integer.parseInt(scanner.next());
                return vehicleId;
            } catch (NumberFormatException e) {
                System.out.println("Nieznana opcja. Spróbuj ponownie.");
            }
        }
    }

    public void showVehicleDetails() {
        Scanner scanner = new Scanner(System.in);
        int vehicleId = scanner.nextInt();
        Vehicle vehicle = vehicles.getVehicleDetails(vehicleId, vehicles.getAvailableVehicles());
        vehiclesView.showVehicleDetails(vehicle);
    }

    public void exampleVehicles() {
        Vehicle vehicle = new Vehicle();
        vehicle.setVehicleId(1);
        vehicle.setModels(Models.MODEL_1);
        vehicle.setName("Vehicle 1");
        vehicle.setVehicleType(Type.FLYING_FIGHTER);
        vehicle.setMileageOfTheVehicle(3000);
        vehicle.setAmountOfFuel(100);
        vehicle.setDateOfProduction(new Date(1287784800000l));

        vehicles.addVehicle(vehicle);

        vehicle = new Vehicle();
        vehicle.setVehicleId(2);
        vehicle.setModels(Models.MODEL_2);
        vehicle.setName("Vehicle 2");
        vehicle.setVehicleType(Type.FLYING_TROOP_SHIP);
        vehicle.setMileageOfTheVehicle(5000);
        vehicle.setAmountOfFuel(1000);
        vehicle.setDateOfProduction(new Date(1287794800000l));

        vehicles.addVehicle(vehicle);
    }
}
