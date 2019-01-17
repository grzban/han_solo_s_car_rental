package pl.gb.edu.codecool.view;

import pl.gb.edu.codecool.model.Vehicle;

public class DetailsVehicleView extends View {

    public DetailsVehicleView() {
        clearConsole();
        System.out.println("4. szczegóły pojazdu");
    }

    public int getDetailsVehicleId() {
        System.out.println("Podaj id pojazdu, którego szczegóły chcesz zobaczyć:");
        return getVehicleId();
    }

    public void showVehicleDetails(Vehicle vehicle) {
        System.out.println("+--------------------------------------------------------------+");
        System.out.println(vehicle.toString());
        System.out.println("+--------------------------------------------------------------+");
    }

    public void nothingToShowInfo() {
        System.out.println("Nic do pokazania");
    }
}
