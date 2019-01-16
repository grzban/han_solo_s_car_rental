package pl.gb.edu.codecool.enums;

public enum Place {
    EXHIBITION(1),
    PARKING(2),
    RENTED(3);

    private int placeId;

    Place(int placeId) {
        this.placeId = placeId;
    }

    public int getPlaceId() {
        return placeId;
    }

    @Override
    public String toString() {
        return "|\t" + placeId + "\t|\t" + name() + "\t|";
    }
}