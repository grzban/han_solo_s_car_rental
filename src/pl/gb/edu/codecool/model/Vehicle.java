package pl.gb.edu.codecool.model;

import java.util.Date;
import java.util.Objects;

public class Vehicle {
    private int vehicleId;
    private String name;
    private String model;
    private Date dateOfProduction;
    private int mileageOfTheVehicle;
    private String type;
    private int amountOfFuel;
    private String place;

    public Vehicle(int vehicleId, String name, String model, Date dateOfProduction, int mileageOfTheVehicle, String type, int amountOfFuel, String place) {
        this.vehicleId = vehicleId;
        this.name = name;
        this.model = model;
        this.dateOfProduction = dateOfProduction;
        this.mileageOfTheVehicle = mileageOfTheVehicle;
        this.type = type;
        this.amountOfFuel = amountOfFuel;
        this.place = place;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Vehicle vehicle = (Vehicle) obj;

        return (vehicleId == vehicle.vehicleId &&
                name.equals(vehicle.name) &&
                model.equals(vehicle.model) &&
                dateOfProduction == vehicle.dateOfProduction &&
                mileageOfTheVehicle == vehicle.mileageOfTheVehicle &&
                type.equals(vehicle.type) &&
                amountOfFuel == vehicle.amountOfFuel &&
                place.equals(vehicle.place));
    }

    @Override
    public int hashCode() {
        return Objects.hash(vehicleId, name, model, dateOfProduction, mileageOfTheVehicle, type, amountOfFuel, place);
    }

    public int getVehicleId() {
        return vehicleId;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("\n+----------------------------------------+\n");
        result.append("\tId:\t" + vehicleId);
        result.append("\n");
        result.append("\tName:\t" + name);
        result.append("\n");
        result.append("\tFuel:\t" + amountOfFuel);
        result.append("\n");
        result.append("\tModel:\t" + model);
        result.append("\n");
        result.append("\tType:\t" + type);
        result.append("\n");
        result.append("\tDate of production:\t" + dateOfProduction);
        result.append("\n");
        result.append("\tMileage Of The Vehicle:\t" + mileageOfTheVehicle);
        result.append("\n");
        result.append("\tActual place:\t" + place + "\n");

        return result.toString();
    }
}
