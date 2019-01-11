package pl.gb.edu.codecool.controller;

import pl.gb.edu.codecool.model.enums.Models;
import pl.gb.edu.codecool.model.enums.Place;
import pl.gb.edu.codecool.model.enums.Type;
import pl.gb.edu.codecool.model.vehicle.VehicleResource;
import pl.gb.edu.codecool.model.vehicle.Vehicle;
import pl.gb.edu.codecool.view.VehiclesView;

import java.util.Date;
import java.util.Scanner;

public class VehiclesController {

    private VehicleResource vehicleResource;
    private VehiclesView vehiclesView;

    public VehiclesController(VehicleResource vehicleResource, VehiclesView vehiclesView) {
        this.vehicleResource = vehicleResource;
        this.vehiclesView = vehiclesView;
        exampleVehicles();
    }

    public void showAvailableVehicles() {
        vehiclesView.showVehicles(vehicleResource.getAvailableVehicles());
    }

    public void showRentedVehicles() {
        vehiclesView.showVehicles(vehicleResource.getRentedVehicles());
    }

    //TODO
    public void removeVehicle() {
//        vehicleResource.removeVehicle(getUserChoice("Który pojazd chcesz usunąć?"));
        showAvailableVehicles();
    }
//    TODO
    public void rentTheVehicle() {
//        vehicleResource.rentTheVehicle(getUserChoice("Który pojazd chcesz wypożyczyć?"));
        showRentedVehicles();
    }

//TODO przenieść do view
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

    //TODO
    public void showVehicleDetails() {
        Scanner scanner = new Scanner(System.in);
        int vehicleId = scanner.nextInt();
        try {
//            Vehicle vehicle = vehicleResource.getVehicleDetails(vehicleId, vehicleResource.getAvailableVehicles());
//            vehiclesView.showVehicleDetails(vehicle);
        } catch (NullPointerException e) {
            System.out.println("Nothing to show");
        }
    }

    //TODO
    public void returnOfTheVehicle () {
        int vehicleId = getUserChoice("Zwrot pojazdu");
//        vehicleResource.returnTheVehicle(vehicleId);
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

        vehicleResource.addVehicle(vehicle, Place.PARKING);

        vehicle = new Vehicle();
        vehicle.setVehicleId(2);
        vehicle.setModels(Models.MODEL_2);
        vehicle.setName("Vehicle 2");
        vehicle.setVehicleType(Type.FLYING_TROOP_SHIP);
        vehicle.setMileageOfTheVehicle(5000);
        vehicle.setAmountOfFuel(1000);
        vehicle.setDateOfProduction(new Date(1287794800000l));

        vehicleResource.addVehicle(vehicle, Place.EXHIBITION);
    }
}
