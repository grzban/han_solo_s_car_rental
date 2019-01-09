package pl.gb.edu.codecool.model.vehicle;

import pl.gb.edu.codecool.model.enums.Model;
import pl.gb.edu.codecool.model.enums.Type;
import pl.gb.edu.codecool.model.enums.VehicleState;

import java.util.Date;

public class Vehicle {
    private int vehicleId;
    private String name;
    private Model model;
    private Date dateOfProduction;
    private int mileageOfTheVehicle;
    private Type vehicleType;
    private int amountOfFuel;
    private VehicleState state;

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

    public VehicleState getState() {
        return state;
    }

    public void setState(VehicleState state) {
        this.state = state;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("Id:\t" + getVehicleId());
        result.append("\nName:\t" + getName());
        result.append("\nAmount of fuel:\t" + getAmountOfFuel());
        result.append("\nModel:\t" + getModel());
        result.append("\nType:\t" + getVehicleType());
        result.append("\nDate of production:\t" + getDateOfProduction());
        result.append("\nMileage Of The Vehicle:\t" + getMileageOfTheVehicle());
        result.append("\nState:\t" + getState());

        return result.toString();
    }
}
