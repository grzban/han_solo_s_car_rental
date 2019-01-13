package pl.gb.edu.codecool.model.vehicle;

import pl.gb.edu.codecool.model.enums.Models;
import pl.gb.edu.codecool.model.enums.Place;
import pl.gb.edu.codecool.model.enums.Type;

import java.util.Date;

public class ExamplVehicle {
    public Vehicle example1() {
        return new Vehicle(1, "Vehicle 1", Models.MODEL_1, new Date(1287784800000l), 3000, Type.GROUND_RIDING, 100, Place.PARKING);
    }

    public Vehicle example2() {
        return new Vehicle(2, "Vehicle 2", Models.MODEL_2, new Date(1287784600000l), 6000, Type.FLYING_FIGHTER, 300, Place.EXHIBITION);
    }
}
