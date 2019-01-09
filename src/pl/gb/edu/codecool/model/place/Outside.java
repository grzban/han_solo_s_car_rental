package pl.gb.edu.codecool.model.place;

import java.util.ArrayList;

public class Outside extends Place{

    public Outside() {
        vehicleInPlace = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "OUTSIDE\t" + super.toString();
    }
}
