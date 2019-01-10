package pl.gb.edu.codecool.controller;

import pl.gb.edu.codecool.model.vehicle.Vehicles;
import pl.gb.edu.codecool.view.Menus;
import pl.gb.edu.codecool.view.VehiclesView;

import java.util.Scanner;

public class MainMenuController {

    private Menus menus;
    private MenuController menuController;
    private VehiclesController vehiclesController;
    private Vehicles vehicles;
    private VehiclesView vehiclesView;

    public MainMenuController(Menus menus) {
        this.menus = menus;
        menus.printMainMenu();
        menuController = new MenuController();
        vehicles = new Vehicles();
        vehiclesView = new VehiclesView();
        vehiclesController = new VehiclesController(vehicles, vehiclesView);
    }

    public void addMainMenuHandler() {

        Scanner scanner = new Scanner(System.in);
        String choice = scanner.next();

        switch (choice) {
            case "q":
                menuController.closeApplication();
                break;
            case "1":
                menus.clearConsole();
                System.out.println("1. lista obecnie dostępnych pojazdów");
                showAvailableVehicles();
                menus.printMainMenu();
                break;
            case "2":
                System.out.println("2. dodanie pojazdu do listy dostępnych pojazdów");
                break;
            case "3":
                menus.clearConsole();
                System.out.println("3. usunięcie pojazdu z listy dostępnych pojazdów");
                showAvailableVehicles();
                vehiclesController.removeVehicle();
                break;
            case "4":
                System.out.println("4. szczegóły pojazdu");
                menus.printMainMenu();
                vehiclesController.showVehicleDetails();
                break;
            case "5":
                System.out.println("5. wypożyczanie pojazdu");
                showAvailableVehicles();
                vehiclesController.rentTheVehicle();
                break;
            case "6":
                System.out.println("6. zwrot pojazdu");
                break;
            default:
                System.out.println("Wybierz inną opcję");
                break;
        }
    }

    private void showAvailableVehicles() {
        vehiclesController.showAvailableVehicles();
    }
}
