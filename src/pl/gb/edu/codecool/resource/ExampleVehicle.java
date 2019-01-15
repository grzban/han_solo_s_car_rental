package pl.gb.edu.codecool.resource;

import pl.gb.edu.codecool.model.Vehicle;

import java.util.Date;

public class ExampleVehicle {

    public Vehicle example1() {
        return new Vehicle(
                1,
                "Vehicle 1",
                "MODEL 1",
                new Date(1287784800000l),
                3000,
                "GROUND_RIDING",
                100,
                "PARKING");
    }

    public Vehicle example2() {
        return new Vehicle(
                2,
                "Vehicle 2",
                "MODEL 2",
                new Date(1287784800000l),
                3000,
                "FLYING_FIGHTER",
                100,
                "EXHIBITION");
    }
}
