package pl.gb.edu.codecool.resource;

import pl.gb.edu.codecool.model.Place;

public class ExamplePlace {
    private PlaceResource placeResource;

    public ExamplePlace() {
        placeResource = new PlaceResource();
        placeResource.addPlace(placeExample1());
        placeResource.addPlace(placeExample2());
        placeResource.addPlace(placeExample3());
    }

    private Place placeExample1() {
        return new Place(1, "Exhibition");
    }

    private Place placeExample2() {
        return new Place(2, "Parking");
    }

    private Place placeExample3() {
        return new Place(3, "Rented");
    }

    public PlaceResource getPlaceResource() {
        return placeResource;
    }
}
