package pl.gb.edu.codecool.model.place;

import java.util.ArrayList;

public class Exhibition extends Place {

    public Exhibition() {
        vehicleInPlace = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "EXIBITION\t" + super.toString();
    }
}
