package pl.gb.edu.codecool.model.vehicle;

import java.util.Date;

public class Vehicle {
    private int vehicleId;
    private String name;
    private Model model;
    private Date dateOfProductio;
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

    public Date getDateOfProductio() {
        return dateOfProductio;
    }

    public void setDateOfProductio(Date dateOfProductio) {
        this.dateOfProductio = dateOfProductio;
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
}