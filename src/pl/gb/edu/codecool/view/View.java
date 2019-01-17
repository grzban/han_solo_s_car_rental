package pl.gb.edu.codecool.view;

import pl.gb.edu.codecool.exception.BadIntegerNumberException;
import pl.gb.edu.codecool.model.Vehicle;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public abstract class View {

    String getStringValue() {
        return getUserChoice();
    }

    public int getIntegerValue() {
        int id;
        while (true) {
            try {
                id = getInteger();
                break;
            } catch (BadIntegerNumberException e) {
                System.out.println(e.getMessage());
            }
        }
        return id;
    }
    public void showVehicles(List<Vehicle> vehicles) {
        Iterator<Vehicle> vehicleIterator = vehicles.listIterator();
        while (vehicleIterator.hasNext()) {
            Vehicle vehicle = vehicleIterator.next();
            System.out.println("|\t" +vehicle.getVehicleId() + "\t|\t" + vehicle.getName() + "\t|");
        }
    }

    public void showVehiclesToRent(List<Vehicle> vehicles) {
        System.out.println("Pojazdy do wypożyczenia");
        showVehicles(vehicles);
    }

    public void showRentedVehicles(List<Vehicle> vehicles) {
        System.out.println("Pojazdy wypożyczone");
        showVehicles(vehicles);
    }

    public int getVehicleId() {
        int vehicleId = getIntegerValue();
        return vehicleId;
    }

    private int getInteger() throws BadIntegerNumberException {
        int number;
        try {
            number = Integer.parseInt(getUserChoice());
        } catch (NumberFormatException e) {
            throw new BadIntegerNumberException("Podałeś złą wartość. Spróbuj ponownie!");
        }
        return number;
    }

    public String getUserChoice() {
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }

    public void clearConsole() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public void closeApplication() {
        System.out.println("No to kończymy! Pa!");
        System.exit(0);
    }
}
