package pl.gb.edu.codecool.model.place;

import java.util.ArrayList;

public class Parking extends Place {
    public Parking() {
        vehicleInPlace = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "PARKING\t" + super.toString();
    }
}
