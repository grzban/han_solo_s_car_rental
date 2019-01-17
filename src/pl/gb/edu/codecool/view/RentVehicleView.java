package pl.gb.edu.codecool.view;

public class RentVehicleView extends View {


    public RentVehicleView() {
        clearConsole();
        System.out.println("5. wypożyczanie pojazdu");
    }

    public int getVehicleIdToRent() {
        System.out.println("Podaj id pojazdu, który chcesz wypożyczyć");
        return getVehicleId();
    }
}
