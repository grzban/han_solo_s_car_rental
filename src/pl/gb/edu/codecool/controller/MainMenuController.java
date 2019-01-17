package pl.gb.edu.codecool.controller;

import pl.gb.edu.codecool.resource.ExampleVehicle;
import pl.gb.edu.codecool.resource.VehicleRentResource;
import pl.gb.edu.codecool.view.*;

public class MainMenuController {
    private MainMenuView mainMenuView;
    private VehicleRentResource vehicleRentResource;
    private AvailableVehiclesView availableVehiclesView;

    public MainMenuController(MainMenuView mainMenuView, VehicleRentResource vehicleRentResource) {
        this.mainMenuView = mainMenuView;
        this.vehicleRentResource = vehicleRentResource;
        addExampleVehicles();
    }

    private void addExampleVehicles() {
        ExampleVehicle exampleVehicle = new ExampleVehicle();
        vehicleRentResource.getAvailableVehicleResource().addVehicle(exampleVehicle.example1());
        vehicleRentResource.getAvailableVehicleResource().addVehicle(exampleVehicle.example2());
    }

    public void showMainMenu() {
        while (true) {
            mainMenuView.printMainMenu();
            mainMenuHandler();
        }
    }

    private void mainMenuHandler() {

        String choice = mainMenuView.getUserChoice();

        switch (choice) {
            case "q":
                mainMenuView.closeApplication();
                break;
            case "1":
                showAvailableVehicles();
                break;
            case "2":
                addVehicle();
                break;
            case "3":
                removeVehicle();
                break;
            case "4":
                showVehicleDetails();
                break;
            case "5":
                rentVehicle();
                break;
            case "6":
                returnVehicle();
                break;
            default:
                System.out.println("Wybierz inną opcję");
                break;
        }
    }

    private void showAvailableVehicles() {
        availableVehiclesView = new AvailableVehiclesView();
        AvailableVehiclesController availableVehiclesController = new AvailableVehiclesController(availableVehiclesView, vehicleRentResource);
        availableVehiclesController.showAvailableVehicles();
    }

    private void addVehicle() {
        AddVehicleView addVehicleView = new AddVehicleView();
        AddVehicleController addVehicleController = new AddVehicleController(vehicleRentResource, addVehicleView);
        addVehicleView.showTitle();
        addVehicleController.addVehicle();
    }

    private void removeVehicle() {
        RemoveVehicleView removeVehicleView = new RemoveVehicleView();
        RemoveVehicleController removeVehicleController = new RemoveVehicleController(removeVehicleView, vehicleRentResource);
        removeVehicleController.removeVehicle();
    }

    private void showVehicleDetails() {
        DetailsVehicleView detailsVehicleView = new DetailsVehicleView();
        DetailsVehicleController detailsVehicleController = new DetailsVehicleController(detailsVehicleView, vehicleRentResource);
        detailsVehicleController.showVehicleDetails();
    }

    private void rentVehicle() {
        RentVehicleView rentVehicleView = new RentVehicleView();
        RentVehicleController rentVehicleController = new RentVehicleController(rentVehicleView, vehicleRentResource);
        rentVehicleController.showVehiclesToRent();
        rentVehicleController.rentVehicle();
        rentVehicleController.showRentedVehicles();
    }

    private void returnVehicle() {
        ReturnVehicleView returnVehicleView = new ReturnVehicleView();
        ReturnVehicleController returnVehicleController = new ReturnVehicleController(returnVehicleView, vehicleRentResource);
        returnVehicleController.returnVehicle();
    }
}