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
