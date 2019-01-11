package pl.gb.edu.codecool.model.vehicle;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pl.gb.edu.codecool.model.enums.Models;
import pl.gb.edu.codecool.model.enums.Type;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class VehiclesTest {

    private Vehicles vehicles;

    @BeforeEach
    void setUp() {
        vehicles = new Vehicles();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void addVehicle() {
        vehicles.addVehicle(createVehicle1());
        vehicles.addVehicle(createVehicle2());
        Assertions.assertEquals(2, vehicles.getAvailableVehicles().size());
    }

    @Test
    void removeVehicle() {
        vehicles.addVehicle(createVehicle1());
        vehicles.addVehicle(createVehicle2());
        vehicles.removeVehicle(1);
        Assertions.assertEquals(1, vehicles.getAvailableVehicles().size());
    }

    @Test
    void returnOfTheVehicle() {
        vehicles.addVehicle(createVehicle1());
    }

    @Test
    void rentTheVehicle() {

    }

    @Test
    void getVehicleDetails() {
        vehicles.addVehicle(createVehicle1());
        vehicles.addVehicle(createVehicle2());
        Assertions.assertSame(createVehicle1(), vehicles.getVehicleDetails(1,vehicles.getAvailableVehicles()));
    }

    @Test
    void getAvailableVehicles() {
    }

    @Test
    void getRentedVehicles() {
    }

    private Vehicle createVehicle1() {
        Vehicle vehicle = new Vehicle();
        vehicle.setVehicleId(1);
        vehicle.setModels(Models.MODEL_1);
        vehicle.setName("Vehicle 1");
        vehicle.setVehicleType(Type.FLYING_FIGHTER);
        vehicle.setMileageOfTheVehicle(3000);
        vehicle.setAmountOfFuel(100);
        vehicle.setDateOfProduction(new Date(1287784800000l));
        return vehicle;
    }

    private Vehicle createVehicle2() {
        Vehicle vehicle = new Vehicle();
        vehicle.setVehicleId(2);
        vehicle.setModels(Models.MODEL_2);
        vehicle.setName("Vehicle 2");
        vehicle.setVehicleType(Type.FLYING_TROOP_SHIP);
        vehicle.setMileageOfTheVehicle(5000);
        vehicle.setAmountOfFuel(1000);
        vehicle.setDateOfProduction(new Date(1287794800000l));
        return vehicle;
    }
}