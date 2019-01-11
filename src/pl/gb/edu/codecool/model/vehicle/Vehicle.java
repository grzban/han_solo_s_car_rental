package pl.gb.edu.codecool.model.vehicle;

import pl.gb.edu.codecool.model.enums.Models;
import pl.gb.edu.codecool.model.enums.Place;
import pl.gb.edu.codecool.model.enums.Type;

import java.util.Date;
import java.util.Objects;

public class Vehicle {
    private int vehicleId;
    private String name;
    private Models models;
    private Date dateOfProduction;
    private int mileageOfTheVehicle;
    private Type vehicleType;
    private int amountOfFuel;
    private Place place;

    public Vehicle() {
    }

    public Vehicle(int vehicleId, String name, Models models, Date dateOfProduction, int mileageOfTheVehicle, Type vehicleType, int amountOfFuel, Place place) {
        this.vehicleId = vehicleId;
        this.name = name;
        this.models = models;
        this.dateOfProduction = dateOfProduction;
        this.mileageOfTheVehicle = mileageOfTheVehicle;
        this.vehicleType = vehicleType;
        this.amountOfFuel = amountOfFuel;
        this.place = place;
    }

    @Override
    public boolean equals(Object o) {
        Vehicle vehicle = (Vehicle) o;
        return
                getVehicleId() == vehicle.getVehicleId() &&
                getMileageOfTheVehicle() == vehicle.getMileageOfTheVehicle() &&
                getAmountOfFuel() == vehicle.getAmountOfFuel() &&
                getName() == vehicle.getName() &&
                getModels() == vehicle.getModels() &&
                getDateOfProduction() == vehicle.getDateOfProduction() &&
                getVehicleType() == vehicle.getVehicleType() &&
                getPlace() == vehicle.getPlace();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getVehicleId(), getName(), getModels(), getDateOfProduction(), getMileageOfTheVehicle(), getVehicleType(), getAmountOfFuel());
    }

    public int getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Models getModels() {
        return models;
    }

    public void setModels(Models models) {
        this.models = models;
    }

    public Date getDateOfProduction() {
        return dateOfProduction;
    }

    public void setDateOfProduction(Date dateOfProduction) {
        this.dateOfProduction = dateOfProduction;
    }

    public int getMileageOfTheVehicle() {
        return mileageOfTheVehicle;
    }

    public void setMileageOfTheVehicle(int mileageOfTheVehicle) {
        this.mileageOfTheVehicle = mileageOfTheVehicle;
    }

    public Type getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(Type vehicleType) {
        this.vehicleType = vehicleType;
    }

    public int getAmountOfFuel() {
        return amountOfFuel;
    }

    public void setAmountOfFuel(int amountOfFuel) {
        this.amountOfFuel = amountOfFuel;
    }

    public Place getPlace() {
        return place;
    }

    public void setPlace(Place place) {
        this.place = place;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("\tId:\t" + getVehicleId());
        result.append("\n");
        result.append("\tName:\t" + getName());
        result.append("\n");
        result.append("\tFuel:\t" + getAmountOfFuel());
        result.append("\n");
        result.append("\tModels:\t" + getModels());
        result.append("\n");
        result.append("\tType:\t" + getVehicleType());
        result.append("\n");
        result.append("\tDate of production:\t" + getDateOfProduction());
        result.append("\n");
        result.append("\tMileage Of The Vehicle:\t" + getMileageOfTheVehicle());
        result.append("\n");
        result.append("\tActual place:\t" + getPlace());

        return result.toString();
    }
}
