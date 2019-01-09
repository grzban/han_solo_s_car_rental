package pl.gb.edu.codecool;

import pl.gb.edu.codecool.model.enums.Model;
import pl.gb.edu.codecool.model.enums.Type;
import pl.gb.edu.codecool.model.enums.VehicleState;
import pl.gb.edu.codecool.model.place.Exhibition;
import pl.gb.edu.codecool.model.place.Outside;
import pl.gb.edu.codecool.model.place.Parking;
import pl.gb.edu.codecool.model.place.Place;
import pl.gb.edu.codecool.model.vehicle.Vehicle;
import pl.gb.edu.codecool.view.VehiclesView;

import java.util.Date;
import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        System.out.println("Wypożyczalnia pojazdów Hana Solo");
/*
//        elementy do controllera
        Vehicle vehicle = new Vehicle();
        vehicle.setVehicleId(1);
        vehicle.setModel(Model.MODEL_1);
        vehicle.setName("Vehicle 1");
        vehicle.setVehicleType(Type.FLYING_FIGHTER);
        vehicle.setMileageOfTheVehicle(3000);
        vehicle.setAmountOfFuel(100);
        vehicle.setDateOfProduction(new Date(1287784800000l));
        vehicle.setState(VehicleState.AVAILABLE_EXHIBITION);

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

        System.out.println("1. lista obecnie dostępnych pojazdów");
        System.out.println("2. dodanie pojazdu do listy dostępnych pojazdów");
        System.out.println("3. usunięcie pojazdu z listy dostępnych pojazdów");
        System.out.println("4. szczegóły pojazdu");
        System.out.println("5. wypożyczanie pojazdu");
        System.out.println("6. zwrot pojazdu");

        Scanner scanner = new Scanner(System.in);

        while (true) {
            String choice = scanner.next();

            switch (choice) {
                case "q":
                    System.out.println("No to pa");
                    System.exit(0);
                    break;
                case "1":
                    System.out.println("1. lista obecnie dostępnych pojazdów");
                    break;
                case "2":
                    System.out.println("2. dodanie pojazdu do listy dostępnych pojazdów");
                    break;
                case "3":
                    System.out.println("3. usunięcie pojazdu z listy dostępnych pojazdów");
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
            System.out.println(choice);
        }

    }
}
