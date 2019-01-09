package pl.gb.edu.codecool.view;

import pl.gb.edu.codecool.model.place.Place;
import pl.gb.edu.codecool.model.vehicle.Vehicle;

import java.util.Iterator;

public class PlacesView {

    private Vehicle vehicle;
    public void showVehiclesInPlace(Place place) {
        Iterator vehicles = place.getVehicleInPlace().listIterator();
        while(vehicles.hasNext()) {
            vehicle = (Vehicle) vehicles.next();
            System.out.println(vehicle.toString());
        }
    }
}
