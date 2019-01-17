package pl.gb.edu.codecool.view;

public class RemoveVehicleView extends View {

    public RemoveVehicleView() {
        clearConsole();
        System.out.println("3. usunięcie pojazdu z listy dostępnych pojazdów");
    }

    public int getRemoveVehicleId() {
        System.out.println("Podaj id pojazdu który chcesz usunąć");
        return getVehicleId();
    }
}
