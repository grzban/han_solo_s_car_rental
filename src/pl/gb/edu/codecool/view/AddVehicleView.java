package pl.gb.edu.codecool.view;

import pl.gb.edu.codecool.enums.Model;
import pl.gb.edu.codecool.enums.Place;
import pl.gb.edu.codecool.enums.Type;
import pl.gb.edu.codecool.exception.MissingModelException;
import pl.gb.edu.codecool.exception.MissingPlaceException;
import pl.gb.edu.codecool.exception.MissingTypeException;

public class AddVehicleView {
    private ViewUtil viewUtil;

    public AddVehicleView() {
        viewUtil = new ViewUtil();
        System.out.println("Dodawanie pojazdu");
        getName();
        getModel();
        getDateOfProduction();
        getMileageOfTheVehicle();
        getType();
        getAmountOfFuel();
        getPlace();
    }

    private void getName() {
        System.out.println("Podaj nazwę");
        viewUtil.getStringValue();
    }

    private void getModel() {
        showModels();
        System.out.println("Wybierz model");
        while (true) {
            try {
                getModelById(viewUtil.getIntegerValue());
                break;
            } catch (MissingModelException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private void getDateOfProduction() {
        System.out.println("Podaj datę produkcji");
        System.out.println("Rok:");
        viewUtil.getIntegerValue();
        System.out.println("Miesiąc:");
        viewUtil.getIntegerValue();
        System.out.println("Dzień:");
        viewUtil.getIntegerValue();
    }

    private void getMileageOfTheVehicle() {
        System.out.println("Podaj przebieg");
        viewUtil.getIntegerValue();
    }

    private void getType() {
        showTypes();
        System.out.println("Wybierz typ");
        while (true) {
            try {
                getTypeById(viewUtil.getIntegerValue());
                break;
            } catch (MissingTypeException e) {
                System.out.println(e.getMessage());
            }
        }
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

    private void getAmountOfFuel() {
        System.out.println("Wpisz pojemność zbiornika paliwa");
        viewUtil.getIntegerValue();
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

    private void getPlace() {
        showPlaces();
        System.out.println("Wybierz miejsce postoju");
        while (true) {
            try {
                getPlaceById(viewUtil.getIntegerValue());
                break;
            } catch (MissingPlaceException e) {
                System.out.println(e.getMessage());
            }
        }
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
