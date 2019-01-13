package pl.gb.edu.codecool;

import pl.gb.edu.codecool.model.vehicle.VehicleResource;
import pl.gb.edu.codecool.view.MainMenuView;


public class Run {

    public static void main(String[] args) {

        VehicleResource vehicleResource = new VehicleResource();
        MainMenuView mainMenuView = new MainMenuView(vehicleResource);

        while (true) {
            mainMenuView.printMainMenu();
            mainMenuView.mainMenuHandler();
        }
    }
}
