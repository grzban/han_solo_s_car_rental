package pl.gb.edu.codecool.view;

public class ReturnVehicleView extends View {
    public ReturnVehicleView() {
        clearConsole();
        System.out.println("6. zwrot pojazdu");
    }

    public int getVehicleIdToReturn() {
        System.out.println("Podaj id pojazdu który chcesz zwrócić");
        return getVehicleId();
    }
}
