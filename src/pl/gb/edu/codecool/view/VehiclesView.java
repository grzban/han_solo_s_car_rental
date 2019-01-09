package pl.gb.edu.codecool.view;

import pl.gb.edu.codecool.model.place.Place;
import pl.gb.edu.codecool.model.vehicle.Vehicle;

import java.util.Iterator;

public class VehiclesView {

    private Vehicle vehicle;

    public void showVehicles(Place availablePlace) {
        Iterator allVehicles = availablePlace.getVehicleInPlace().listIterator();
        System.out.println("+--------------------------------------------------------------+");

        while(allVehicles.hasNext()) {
            vehicle = (Vehicle) allVehicles.next();
            System.out.println("|\t"+ vehicle.getVehicleId() + "\t|\t" + vehicle.getName() + "\t|");
        }

        System.out.println("+--------------------------------------------------------------+");
    }

    public void showVehicleDetails(int vehicleId) {

    }
}
