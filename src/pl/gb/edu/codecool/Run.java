package pl.gb.edu.codecool;

import pl.gb.edu.codecool.controller.MainMenuController;
import pl.gb.edu.codecool.resource.VehicleRentResource;
import pl.gb.edu.codecool.view.MainMenuView;

public class Run {

    public static void main(String[] args) {
        MainMenuView mainMenuView = new MainMenuView();
        VehicleRentResource vehicleRentResource = new VehicleRentResource();
        MainMenuController mainMenuController = new MainMenuController(mainMenuView, vehicleRentResource);
        mainMenuController.showMainMenu();
    }
}
