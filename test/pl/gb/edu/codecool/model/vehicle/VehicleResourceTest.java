package pl.gb.edu.codecool.model.vehicle;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pl.gb.edu.codecool.model.enums.Models;
import pl.gb.edu.codecool.model.enums.Type;

import java.util.Date;

class VehicleResourceTest {

    private VehicleResource vehicleResource;

    @BeforeEach
    void setUp() {
        vehicleResource = new VehicleResource();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void addVehicle() {
        vehicleResource.addVehicle(createVehicle1());
        vehicleResource.addVehicle(createVehicle2());
        Assertions.assertEquals(2, vehicleResource.getAvailableVehicles().size());
    }

    @Test
    void removeVehicle() {
        vehicleResource.addVehicle(createVehicle1());
        vehicleResource.addVehicle(createVehicle2());
        vehicleResource.removeVehicle(1);
        Assertions.assertEquals(1, vehicleResource.getAvailableVehicles().size());
    }

    @Test
    void returnOfTheVehicle() {
        vehicleResource.addVehicle(createVehicle1());
    }

    @Test
    void rentTheVehicle() {

    }

    @Test
    void getVehicleDetails() {
        vehicleResource.addVehicle(createVehicle1());
        vehicleResource.addVehicle(createVehicle2());
        Assertions.assertSame(createVehicle1(), vehicleResource.getVehicleDetails(1, vehicleResource.getAvailableVehicles()));
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