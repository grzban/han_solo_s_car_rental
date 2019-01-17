package pl.gb.edu.codecool.view;

public class RemoveVehicleView {
    private int vehicleId;


    public RemoveVehicleView() {
        ViewUtil viewUtil = new ViewUtil();
        vehicleId = viewUtil.getIntegerValue();
        System.out.println("3. usunięcie pojazdu z listy dostępnych pojazdów");
    }

    public int getVehicleId() {
        return vehicleId;
    }
}
