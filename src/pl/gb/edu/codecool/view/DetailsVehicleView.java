package pl.gb.edu.codecool.view;

import pl.gb.edu.codecool.model.Vehicle;

public class DetailsVehicleView {

    private ViewUtil viewUtil;
    private Vehicle vehicle;

    public DetailsVehicleView() {
        viewUtil = new ViewUtil();
    }

    public int getVehicleId() {
        System.out.println("Podaj id pojazdu, którego szczegóły chcesz zobaczyć:");
        return viewUtil.getIntegerValue();
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
