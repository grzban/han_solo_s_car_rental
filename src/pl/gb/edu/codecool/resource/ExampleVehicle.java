package pl.gb.edu.codecool.resource;

import pl.gb.edu.codecool.enums.Model;
import pl.gb.edu.codecool.enums.Place;
import pl.gb.edu.codecool.enums.Type;
import pl.gb.edu.codecool.model.Vehicle;

import java.time.LocalDate;

public class ExampleVehicle {

    public Vehicle example1() {
        return new Vehicle(
                1,
                "Vehicle 1",
                Model.MODEL_1,
                LocalDate.of(2010, 10, 23),
                3000,
                Type.FLYING_FIGHTER,
                100,
                Place.EXHIBITION);
    }

    public Vehicle example2() {
        return new Vehicle(
                2,
                "Vehicle 2",
                Model.MODEL_2,
                LocalDate.of(2010, 1, 3),
                3000,
                Type.GROUND_RIDING,
                100,
                Place.PARKING);
    }
}
