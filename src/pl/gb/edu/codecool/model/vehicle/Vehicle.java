package pl.gb.edu.codecool.model.vehicle;

import pl.gb.edu.codecool.model.enums.Model;
import pl.gb.edu.codecool.model.enums.Type;

import java.util.Date;

public class Vehicle {
    private int vehicleId;
    private String name;
    private Model model;
    private Date dateOfProduction;
    private int mileageOfTheVehicle;
    private Type vehicleType;
    private int amountOfFuel;

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

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
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
        result.append("\tModel:\t" + getModel());
        result.append("\n");
        result.append("\tType:\t" + getVehicleType());
        result.append("\n");
        result.append("\tDate of production:\t" + getDateOfProduction());
        result.append("\n");
        result.append("\tMileage Of The Vehicle:\t" + getMileageOfTheVehicle());

        return result.toString();
    }
}
