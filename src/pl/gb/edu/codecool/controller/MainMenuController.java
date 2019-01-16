package pl.gb.edu.codecool.controller;

import pl.gb.edu.codecool.resource.ExampleVehicle;
import pl.gb.edu.codecool.resource.VehicleRentResource;
import pl.gb.edu.codecool.view.AddVehicleView;
import pl.gb.edu.codecool.view.AvailableVehiclesView;
import pl.gb.edu.codecool.view.MainMenuView;
import pl.gb.edu.codecool.view.ViewUtil;

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
                System.out.println("1. lista obecnie dostępnych pojazdów");
                showAvailableVehicles();
                break;
            case "2":
                System.out.println("2. dodanie pojazdu do listy dostępnych pojazdów");
                addVehicle();
                break;
            case "3":
                viewUtil.clearConsole();
                System.out.println("3. usunięcie pojazdu z listy dostępnych pojazdów");
//                showAvailableVehicles();
                System.out.println("Podaj id pojazdu który chcesz usunąć:");
//                removeVehicle();
                break;
            case "4":
                viewUtil.clearConsole();
                System.out.println("4. szczegóły pojazdu");
//                showAvailableVehicles();
                System.out.println("Podaj id pojazdu który chcesz usunąć:");
//                showVehicleDetails();
                break;
            case "5":
//                clearConsole();
                System.out.println("5. wypożyczanie pojazdu");
//                showAvailableVehicles();
                System.out.println("Podaj id pojazdu który chcesz wypożyczyć");
//                rentTheVehicle();
                System.out.println("Dostępne pojazdy");
//                showAvailableVehicles();
                System.out.println("Wypożyczone pojazdy");
//                showRentedVehicles();
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
        AvailableVehiclesView availableVehiclesView = new AvailableVehiclesView();
        AvailableVehiclesController availableVehiclesController = new AvailableVehiclesController(vehicleRentResource, availableVehiclesView);
        availableVehiclesController.showAvailableVehicles();
    }

    private void addVehicle() {
        AddVehicleView addVehicleView = new AddVehicleView();
        AddVehicleController addVehicleController = new AddVehicleController(vehicleRentResource, addVehicleView);
        addVehicleController.addVehicle();
    }
}