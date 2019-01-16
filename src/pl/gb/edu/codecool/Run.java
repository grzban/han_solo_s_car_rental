package pl.gb.edu.codecool;

import pl.gb.edu.codecool.controller.AddVehicleController;
import pl.gb.edu.codecool.controller.AvailableVehiclesController;
import pl.gb.edu.codecool.controller.MainMenuController;
import pl.gb.edu.codecool.resource.ExampleVehicle;
import pl.gb.edu.codecool.resource.VehicleRentResource;
import pl.gb.edu.codecool.view.AddVehicleView;
import pl.gb.edu.codecool.view.AvailableVehiclesView;
import pl.gb.edu.codecool.view.MainMenuView;


public class Run {

    public static void main(String[] args) {
       /* VehicleRentResource vehicleRentResource = new VehicleRentResource();
        ExampleVehicle exampleVehicle = new ExampleVehicle();
        vehicleRentResource.getAvailableVehicleResource().addVehicle(exampleVehicle.example1());
        vehicleRentResource.getAvailableVehicleResource().addVehicle(exampleVehicle.example2());

        AvailableVehiclesView availableVehiclesView = new AvailableVehiclesView();

        AvailableVehiclesController availableVehiclesController = new AvailableVehiclesController(vehicleRentResource, availableVehiclesView);
        availableVehiclesController.showAvailableVehicles();

        AddVehicleView addVehicleView = new AddVehicleView();
        AddVehicleController addVehicleController = new AddVehicleController(addVehicleView, vehicleRentResource);
        addVehicleController.addVehicle();
        availableVehiclesController.showAvailableVehicles();*/

        MainMenuView mainMenuView = new MainMenuView();
        VehicleRentResource vehicleRentResource = new VehicleRentResource();
        MainMenuController mainMenuController = new MainMenuController(mainMenuView, vehicleRentResource);
        mainMenuController.showMainMenu();
    }
}
