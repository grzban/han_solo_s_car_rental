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

public class Run {
    public static void main(String[] args) {
        System.out.println("Han Solo's car rental");

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

        System.out.println("All vehicles in outside");
        VehiclesView vehiclesView = new VehiclesView();
        vehiclesView.showVehicles(outside);

    }
}
