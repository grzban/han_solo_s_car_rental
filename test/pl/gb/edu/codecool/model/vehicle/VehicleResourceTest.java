/*
package pl.gb.edu.codecool.model.vehicle;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pl.gb.edu.codecool.exception.VehicleNotExistsException;
import pl.gb.edu.codecool.model.Vehicle;
import pl.gb.edu.codecool.model.enums.ModelResource;
import pl.gb.edu.codecool.model.enums.Place;
import pl.gb.edu.codecool.model.enums.Type;
import pl.gb.edu.codecool.resource.AvailableVehicleResource;

import java.util.Date;

class VehicleResourceTest {

    private AvailableVehicleResource vehicleResource;
    private Vehicle vehicle1;
    private Vehicle vehicle2;

    @BeforeEach
    void setUp() {
        vehicleResource = new AvailableVehicleResource();
        vehicle1 = createVehicle1();
        vehicle2 = createVehicle2();
        vehicleResource.addVehicle(vehicle1, Place.PARKING);
        vehicleResource.addVehicle(vehicle2, Place.EXHIBITION);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void addVehicle() {
        Assertions.assertEquals(2, vehicleResource.getAvailableVehicles().size());
    }

    @Test
    void getRemoveVehicleId() {

        try {
            vehicleResource.getRemoveVehicleId(1);
        } catch (VehicleNotExistsException e) {
            e.getMessage();
        }
        Assertions.assertEquals(1, vehicleResource.getAvailableVehicles().size());
    }

    @Test
    void rentTheVehicle() {
        try {
            vehicleResource.rentTheVehicle(1);
        } catch (VehicleNotExistsException e) {
            e.getMessage();
        }

        Assertions.assertSame(vehicle1, vehicleResource.getVehicleById(1, vehicleResource.getRentedVehicles()));
        Assertions.assertEquals(1, vehicleResource.getRentedVehicles().size());
        Assertions.assertEquals(1, vehicleResource.getAvailableVehicles().size());
    }

    @Test
    void returnTheVehicle() {
        Assertions.assertEquals(2, vehicleResource.getAvailableVehicles().size());
        Assertions.assertEquals(0, vehicleResource.getRentedVehicles().size());
        try {
            vehicleResource.rentTheVehicle(1);
            vehicleResource.returnTheVehicle(1, Place.PARKING);
        } catch (VehicleNotExistsException e) {
            e.getMessage();
        }
        Assertions.assertEquals(2, vehicleResource.getAvailableVehicles().size());
        Assertions.assertEquals(0, vehicleResource.getRentedVehicles().size());
    }

    @Test
    void getVehicleDetails() {
        Assertions.assertSame(vehicle1, vehicleResource.getVehicleById(1, vehicleResource.getAvailableVehicles()));
        Assertions.assertSame(vehicle2, vehicleResource.getVehicleById(2, vehicleResource.getAvailableVehicles()));
    }

    private Vehicle createVehicle1() {
        Vehicle vehicle = new Vehicle(1, "Vehicle 1", ModelResource.MODEL_1, new Date(1287784800000l), 3000, Type.FLYING_FIGHTER, 1000, Place.EXHIBITION);
        return vehicle;
    }

    private Vehicle createVehicle2() {
        Vehicle vehicle = new Vehicle(2, "Vehicle 2", ModelResource.MODEL_2, new Date(1287784700000l), 7000, Type.GROUND_RIDING, 1000, Place.PARKING);
        return vehicle;
    }
}*/
