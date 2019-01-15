package pl.gb.edu.codecool.model;

import java.util.Objects;

public class Place {
    private int placeId;
    private String placeName;

    public Place(int placeId, String placeName) {
        this.placeId = placeId;
        this.placeName = placeName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Place place = (Place) o;
        return placeId == place.placeId &&
                placeName.equals(place.placeName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(placeId, placeName);
    }

    @Override
    public String toString() {
        return "|\t" + placeId + "\t|\t" + placeName + "\t|\n";
    }
}
