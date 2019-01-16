package pl.gb.edu.codecool.view;

import pl.gb.edu.codecool.enums.Model;
import pl.gb.edu.codecool.enums.Place;
import pl.gb.edu.codecool.enums.Type;
import pl.gb.edu.codecool.exception.MissingModelException;
import pl.gb.edu.codecool.exception.MissingPlaceException;
import pl.gb.edu.codecool.exception.MissingTypeException;

import java.util.Date;

public class AddVehicleView {
    private ViewUtil viewUtil;

    public AddVehicleView() {
        viewUtil = new ViewUtil();
        System.out.println("Dodawanie pojazdu");
    }

    public String getName() {
        System.out.println("Podaj nazwę");
        return viewUtil.getStringValue();
    }

    public Model getModel() {
        showModels();
        System.out.println("Wybierz model");
        Model model;
        while (true) {
            try {
                model = getModelById(viewUtil.getIntegerValue());
                break;
            } catch (MissingModelException e) {
                System.out.println(e.getMessage());
            }
        }
        return model;
    }

    public Date getDateOfProduction() {
        System.out.println("Podaj datę produkcji");
        System.out.println("Rok:");
        viewUtil.getIntegerValue();
        System.out.println("Miesiąc:");
        viewUtil.getIntegerValue();
        System.out.println("Dzień:");
        viewUtil.getIntegerValue();
        return new Date();
    }

    public int getMileageOfTheVehicle() {
        System.out.println("Podaj przebieg");
        return viewUtil.getIntegerValue();
    }

    public Type getType() {
        showTypes();
        System.out.println("Wybierz typ");
        Type type;
        while (true) {
            try {
                type = getTypeById(viewUtil.getIntegerValue());
                break;
            } catch (MissingTypeException e) {
                System.out.println(e.getMessage());
            }
        }
        return type;
    }

    private Type getTypeById(int typeId) throws MissingTypeException {
        Type type = null;
        for (Type t : Type.values()) {
            if (t.getTypeId() == typeId) {
                type = t;
            }
        }

        if (type != null) {
            return type;
        } else {
            throw new MissingTypeException("Nie ma takiego typu. Spróbuj jeszcze raz!");
        }
    }

    public int getAmountOfFuel() {
        System.out.println("Wpisz pojemność zbiornika paliwa");
        return viewUtil.getIntegerValue();
    }

    private void showModels() {
        for (Model model : Model.values()) {
            System.out.println(model);
        }
    }

    private void showTypes() {
        for (Type type : Type.values()) {
            System.out.println(type);
        }
    }

    private void showPlaces() {
        for (Place place : Place.values()) {
            System.out.println(place);
        }
    }

    private Model getModelById(int modelId) throws MissingModelException {
        Model model = null;
        for (Model m : Model.values()) {
            if (m.getModelId() == modelId) {
                model = m;
                break;
            }
        }

        if (model != null) {
            return model;
        } else {
            throw new MissingModelException("Nie ma takiego modelu. Spróbuj jeszcze raz");
        }
    }

    public Place getPlace() {
        showPlaces();
        System.out.println("Wybierz miejsce postoju");
        Place place;
        while (true) {
            try {
                place = getPlaceById(viewUtil.getIntegerValue());
                break;
            } catch (MissingPlaceException e) {
                System.out.println(e.getMessage());
            }
        }
        return place;
    }

    private Place getPlaceById(int placeId) throws MissingPlaceException {
        Place place = null;
        for (Place p : Place.values()) {
            if (p.getPlaceId() == placeId) {
                place = p;
                break;
            }
        }
        if (place != null) {
            return place;
        } else {
            throw new MissingPlaceException("Nie ma takiego miejsca. Spróbuj jeszcze raz");
        }
    }
}
