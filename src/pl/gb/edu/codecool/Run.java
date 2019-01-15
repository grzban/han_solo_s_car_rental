package pl.gb.edu.codecool;

import pl.gb.edu.codecool.resource.ExampleVehicle;
import pl.gb.edu.codecool.resource.VehicleRentResource;


public class Run {

    public static void main(String[] args) {
        VehicleRentResource vehicleRentResource = new VehicleRentResource();
        ExampleVehicle exampleVehicle = new ExampleVehicle();
        vehicleRentResource.getAvailableVehicleResource().addVehicle(exampleVehicle.example1());
        vehicleRentResource.getAvailableVehicleResource().addVehicle(exampleVehicle.example2());

        System.out.println(vehicleRentResource);

        vehicleRentResource.rentVehicle(1);

        System.out.println(vehicleRentResource);

        vehicleRentResource.returnVehicle(1, "PARKING");
        System.out.println(vehicleRentResource);


        vehicleRentResource.rentVehicle(100);
    }
}
