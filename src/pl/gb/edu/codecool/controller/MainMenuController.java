package pl.gb.edu.codecool.controller;

import pl.gb.edu.codecool.model.vehicle.Vehicles;
import pl.gb.edu.codecool.view.MainMenu;
import pl.gb.edu.codecool.view.VehiclesView;

import java.util.Scanner;

public class MainMenuController {

    private MainMenu mainMenu;
    private VehiclesController vehiclesController;
    private Vehicles vehicles;
    private VehiclesView vehiclesView;

    public MainMenuController(MainMenu mainMenu) {
        this.mainMenu = mainMenu;
        mainMenu.printMainMenu();
        vehicles = new Vehicles();
        vehiclesView = new VehiclesView();
        vehiclesController = new VehiclesController(vehicles, vehiclesView);
    }

    public void addMainMenuHandler() {

        Scanner scanner = new Scanner(System.in);
        String choice = scanner.next();

        switch (choice) {
            case "q":
                System.out.println("No to pa");
                System.exit(0);
                break;
            case "1":
                mainMenu.clearConsole();
                System.out.println("1. lista obecnie dostępnych pojazdów");
                showAvailableVehicles();
                mainMenu.printMainMenu();
                break;
            case "2":
                System.out.println("2. dodanie pojazdu do listy dostępnych pojazdów");
                break;
            case "3":
                mainMenu.clearConsole();
                System.out.println("3. usunięcie pojazdu z listy dostępnych pojazdów");
                showAvailableVehicles();
                vehiclesController.removeVehicle();

                break;
            case "4":
                System.out.println("4. szczegóły pojazdu");
                break;
            case "5":
                System.out.println("5. wypożyczanie pojazdu");
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
