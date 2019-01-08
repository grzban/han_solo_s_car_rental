package pl.gb.edu.codecool;

import pl.gb.edu.codecool.model.vehicle.Model;
import pl.gb.edu.codecool.model.vehicle.Models;
import pl.gb.edu.codecool.model.vehicle.Vehicle;

public class Run {
    public static void main(String[] args) {
        System.out.println("Han Solo's car rental");

        Models models = new Models();
        models.addModel(new Model("Model nr 1"));

        Vehicle vechicle = new Vehicle();
        vechicle.setVehicleId(1);
//        vechicle.setModel(models.);
    }mm
}
