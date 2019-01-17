package pl.gb.edu.codecool.controller;

import pl.gb.edu.codecool.model.Vehicle;
import pl.gb.edu.codecool.resource.ExampleVehicle;
import pl.gb.edu.codecool.resource.VehicleRentResource;
import pl.gb.edu.codecool.view.*;

public class MainMenuController {
    private MainMenuView mainMenuView;
    private VehicleRentResource vehicleRentResource;
    private ViewUtil viewUtil;


    public MainMenuController(MainMenuView mainMenuView, VehicleRentResource vehicleRentResource) {
        this.mainMenuView = mainMenuView;
        this.vehicleRentResource = vehicleRentResource;
        viewUtil = new ViewUtil();
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

        String choice = viewUtil.getUserChoice();

        switch (choice) {
            case "q":
                viewUtil.closeApplication();
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
                System.out.println("6. zwrot pojazdu");
                System.out.println("Wypożyczone pojazdy");
//                showRentedVehicles();
                System.out.println("Podaj id pojazdu, który chcesz zwrócić?");
//                returnTheVehicle();
                System.out.println("Dostępne pojazdy");
//                showAvailableVehicles();
                System.out.println("Wypożyczone pojazdy");
//                showRentedVehicles();
                break;
            default:
                System.out.println("Wybierz inną opcję");
                break;
        }
    }

    private void showAvailableVehicles() {
        viewUtil.clearConsole();
        AvailableVehiclesView availableVehiclesView = new AvailableVehiclesView();
        AvailableVehiclesController availableVehiclesController = new AvailableVehiclesController(availableVehiclesView, vehicleRentResource);
        availableVehiclesController.showAvailableVehicles();
    }

    private void showRentedVehicles() {
        System.out.println("Wypożyczone pojazdy");
        RentVehicleView rentVehicleView = new RentVehicleView();
        RentVehicleController rentVehicleController = new RentVehicleController(rentVehicleView, vehicleRentResource);
        rentVehicleController.showRentedVehicles();
    }

    private void addVehicle() {
        viewUtil.clearConsole();
        AddVehicleView addVehicleView = new AddVehicleView();
        AddVehicleController addVehicleController = new AddVehicleController(vehicleRentResource, addVehicleView);
        addVehicleController.addVehicle();
    }

    private void removeVehicle() {
        viewUtil.clearConsole();
        RemoveVehicleView removeVehicleView = new RemoveVehicleView();
        RemoveVehicleController removeVehicleController = new RemoveVehicleController(removeVehicleView, vehicleRentResource);
        showAvailableVehicles();
        System.out.println("Podaj id pojazdu który chcesz usunąć:");
        removeVehicleController.removeVehicle();
    }

    private void showVehicleDetails() {
        viewUtil.clearConsole();
        DetailsVehicleView detailsVehicleView = new DetailsVehicleView();
        DetailsVehicleController detailsVehicleController = new DetailsVehicleController(detailsVehicleView, vehicleRentResource);
        showAvailableVehicles();
        detailsVehicleController.showVehicleDetails();
    }

    private void rentVehicle() {
        viewUtil.clearConsole();
        RentVehicleView rentVehicleView = new RentVehicleView();
        RentVehicleController rentVehicleController = new RentVehicleController(rentVehicleView, vehicleRentResource);
        showAvailableVehicles();
        System.out.println("Podaj id pojazdu który chcesz wypożyczyć");
        vehicleRentResource.rentVehicle(rentVehicleView.getVehicleId());
        showAvailableVehicles();

        showRentedVehicles();
    }
}