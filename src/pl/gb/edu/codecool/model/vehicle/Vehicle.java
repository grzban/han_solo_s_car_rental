package pl.gb.edu.codecool.model.vehicle;

import pl.gb.edu.codecool.model.enums.Models;
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

    public Vehicle() {
    }

    public Vehicle(int vehicleId, String name, Models models, Date dateOfProduction, int mileageOfTheVehicle, Type vehicleType, int amountOfFuel) {
        this.vehicleId = vehicleId;
        this.name = name;
        this.models = models;
        this.dateOfProduction = dateOfProduction;
        this.mileageOfTheVehicle = mileageOfTheVehicle;
        this.vehicleType = vehicleType;
        this.amountOfFuel = amountOfFuel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vehicle)) return false;
        Vehicle vehicle = (Vehicle) o;
        return getVehicleId() == vehicle.getVehicleId() &&
                getMileageOfTheVehicle() == vehicle.getMileageOfTheVehicle() &&
                getAmountOfFuel() == vehicle.getAmountOfFuel() &&
                Objects.equals(getName(), vehicle.getName()) &&
                getModels() == vehicle.getModels() &&
                Objects.equals(getDateOfProduction(), vehicle.getDateOfProduction()) &&
                getVehicleType() == vehicle.getVehicleType();
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

        return result.toString();
    }
}
