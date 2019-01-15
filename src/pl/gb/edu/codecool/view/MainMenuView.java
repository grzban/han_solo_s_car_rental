package pl.gb.edu.codecool.view;

import pl.gb.edu.codecool.exception.VehicleNotExistsException;
import pl.gb.edu.codecool.model.Model;
import pl.gb.edu.codecool.model.Vehicle;
import pl.gb.edu.codecool.resource.AvailableVehicleResource;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class MainMenuView {

    private AvailableVehicleResource vehicleResource;
    private Vehicle vehicle;

    public MainMenuView(AvailableVehicleResource vehicleResource) {
        this.vehicleResource = vehicleResource;
    }

    public void printMainMenu() {
        clearConsole();
        System.out.println("Wypożyczalnia pojazdów Hana Solo");
        System.out.println("1. lista obecnie dostępnych pojazdów");
        System.out.println("2. dodanie pojazdu do listy dostępnych pojazdów");
        System.out.println("3. usunięcie pojazdu z listy dostępnych pojazdów");
        System.out.println("4. szczegóły pojazdu");
        System.out.println("5. wypożyczanie pojazdu");
        System.out.println("6. zwrot pojazdu");
        System.out.println("q. zakończenie działania programu");
    }

    public void clearConsole() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
/*
    public void mainMenuHandler() {

        String choice = getUserChoice();

        switch (choice) {
            case "q":
                closeApplication();
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
                clearConsole();
                System.out.println("3. usunięcie pojazdu z listy dostępnych pojazdów");
                showAvailableVehicles();
                System.out.println("Podaj id pojazdu który chcesz usunąć:");
                removeVehicle();
                break;
            case "4":
                clearConsole();
                System.out.println("4. szczegóły pojazdu");
                showAvailableVehicles();
                System.out.println("Podaj id pojazdu który chcesz usunąć:");
                showVehicleDetails();
                break;
            case "5":
                clearConsole();
                System.out.println("5. wypożyczanie pojazdu");
                showAvailableVehicles();
                System.out.println("Podaj id pojazdu który chcesz wypożyczyć");
                rentTheVehicle();
                System.out.println("Dostępne pojazdy");
                showAvailableVehicles();
                System.out.println("Wypożyczone pojazdy");
                showRentedVehicles();
                break;
            case "6":
                System.out.println("6. zwrot pojazdu");
                System.out.println("Wypożyczone pojazdy");
                showRentedVehicles();
                System.out.println("Podaj id pojazdu, który chcesz zwrócić?");
                returnTheVehicle();
                System.out.println("Dostępne pojazdy");
                showAvailableVehicles();
                System.out.println("Wypożyczone pojazdy");
                showRentedVehicles();
                break;
            default:
                System.out.println("Wybierz inną opcję");
                break;
        }
    }*/

    /*private void showAvailableVehicles() {
        showAvailableVehicles(vehicleResource.getAvailableVehicles());
    }

    private void showRentedVehicles() {
        showAvailableVehicles(vehicleResource.getRentedVehicles());
    }

    private String getUserChoice() {
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }

    private int getVehicleId() {
        int vehicleId;
        while (true) {
            try {
                vehicleId = Integer.parseInt(getUserChoice());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Wprowadz poprwane id");
            }
        }
        return vehicleId;
    }

    private void closeApplication() {
        System.out.println("No to kończymy! Pa!");
        System.exit(0);
    }

    private void showAvailableVehicles(List<Vehicle> vehicles) {
        Iterator<Vehicle> allVehicles = vehicles.listIterator();
        if (allVehicles.hasNext()) {
            System.out.println("+--------------------------------------------------------------+");

            while (allVehicles.hasNext()) {
                vehicle = allVehicles.next();
                System.out.println("|\t" + vehicle.getVehicleId() + "\t|\t" + vehicle.getName() + "\t|");
                System.out.println("+--------------------------------------------------------------+");
            }
        } else {
            System.out.println("There aren't any vehicles");
        }
    }

    private void showVehicleDetails(Vehicle vehicle) {
        System.out.println("+--------------------------------------------------------------+");
        System.out.println(vehicle.toString());
        System.out.println("+--------------------------------------------------------------+");
    }

    private void showVehicleDetails() {
        int vehicleId = getVehicleId();
        try {
            showVehicleDetails(vehicleResource.getAvailableVehicleById(vehicleId));
        } catch (VehicleNotExistsException e) {
            System.out.println(e.getMessage());
        }
    }

    public void removeVehicle() {
        int vehicleId = getVehicleId();
        try {
            vehicleResource.removeVehicle(vehicleId);
        } catch (VehicleNotExistsException e) {
            System.out.println(e.getMessage());
        }
    }

    public void rentTheVehicle() {
        int vehicleId = getVehicleId();
        try {
            vehicleResource.rentTheVehicle(vehicleId);
        } catch (VehicleNotExistsException e) {
            System.out.println(e.getMessage());
        }
    }

    public void returnTheVehicle() {
        int vehicleId = getVehicleId();
        System.out.println("W jakiej lokalizacji znajduje się pojazd?");

        try {
            vehicleResource.returnTheVehicle(vehicleId, Place.EXHIBITION);
        } catch (VehicleNotExistsException e) {
            System.out.println(e.getMessage());
        }
    }

    private void addVehicle() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj nazwę pojazdu");
        String name = scanner.next();


        System.out.println("Podaj id modelu:");
        showModels();
        int modelId = getVehicleId();

        *//*Date dateOfProduction,
        int mileageOfTheVehicle,
        Type vehicleType,
        int amountOfFuel,
        Place place

        Vehicle = new Vehicle(name, )
        vehicleResource.addVehicle();*//*
    }

    private void showModels() {
        ModelResource modelResource = new ModelResource();
        Iterator<Model> modelIterator = modelResource.getModels().iterator();
        while (modelIterator.hasNext()) {
            System.out.println(modelIterator.next());
        }
    }*/
}
