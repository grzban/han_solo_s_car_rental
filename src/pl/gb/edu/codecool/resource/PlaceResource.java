package pl.gb.edu.codecool.resource;

import pl.gb.edu.codecool.model.Place;

import java.util.HashSet;
import java.util.Set;

public class PlaceResource {
    private Set<Place> places;

    public PlaceResource() {
        places = new HashSet<>();
    }

    void addPlace(Place place) {
        places.add(place);
    }

    public Set<Place> getPlaces() {
        return places;
    }
}
