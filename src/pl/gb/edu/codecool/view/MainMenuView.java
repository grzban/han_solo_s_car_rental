package pl.gb.edu.codecool.view;

import pl.gb.edu.codecool.model.Vehicle;
import pl.gb.edu.codecool.resource.AvailableVehicleResource;

public class MainMenuView {

//    private AvailableVehicleResource vehicleResource;
//    private Vehicle vehicle;

/*
    public MainMenuView(AvailableVehicleResource vehicleResource) {
        this.vehicleResource = vehicleResource;
    }
*/

    private ViewUtil viewUtil;

    public MainMenuView() {
        viewUtil = new ViewUtil();
    }

    public void printMainMenu() {
        viewUtil.clearConsole();
        System.out.println("Wypożyczalnia pojazdów Hana Solo");
        System.out.println("1. lista obecnie dostępnych pojazdów");
        System.out.println("2. dodanie pojazdu do listy dostępnych pojazdów");
        System.out.println("3. usunięcie pojazdu z listy dostępnych pojazdów");
        System.out.println("4. szczegóły pojazdu");
        System.out.println("5. wypożyczanie pojazdu");
        System.out.println("6. zwrot pojazdu");
        System.out.println("q. zakończenie działania programu");
    }

    /*

    private void showRentedVehicles() {
        showAvailableVehicles(vehicleResource.getRentedVehicles());
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

    }*/
}
