package pl.gb.edu.codecool;

import pl.gb.edu.codecool.controller.MainMenuController;
import pl.gb.edu.codecool.model.enums.Model;
import pl.gb.edu.codecool.model.enums.Type;
import pl.gb.edu.codecool.model.enums.VehicleState;
import pl.gb.edu.codecool.model.place.Exhibition;
import pl.gb.edu.codecool.model.place.Outside;
import pl.gb.edu.codecool.model.place.Parking;
import pl.gb.edu.codecool.model.place.Place;
import pl.gb.edu.codecool.model.vehicle.Vehicle;
import pl.gb.edu.codecool.view.MainMenu;
import pl.gb.edu.codecool.view.VehiclesView;

import java.util.Date;
import java.util.Scanner;

public class Run {

    public static void main(String[] args) {

/*
//        elementy do controllera


        Place outside = new Outside();
        Place exibition = new Exhibition();
        Place parking = new Parking();

        outside.addVehicleToPlace(vehicle);

        System.out.println(vehicle);
        System.out.println(outside);

        VehiclesView vehiclesView = new VehiclesView();
        System.out.println("All vehicles in outside");
        vehiclesView.showVehicles(outside);

        System.out.println("Vehicle details");
        vehiclesView.showVehicleDetails(1, outside);*/
        MainMenu mainMenu = new MainMenu();
        MainMenuController mainMenuController = new MainMenuController(mainMenu);
        while (true) {
            mainMenuController.addMainMenuHandler();
        }
    }
}
