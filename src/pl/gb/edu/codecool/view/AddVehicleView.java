package pl.gb.edu.codecool.view;

import pl.gb.edu.codecool.enums.Model;
import pl.gb.edu.codecool.enums.Place;
import pl.gb.edu.codecool.enums.Type;
import pl.gb.edu.codecool.exception.MissingModelException;
import pl.gb.edu.codecool.exception.MissingPlaceException;
import pl.gb.edu.codecool.exception.MissingTypeException;

import java.time.*;
import java.time.format.DateTimeParseException;

public class AddVehicleView {
    private ViewUtil viewUtil;

    public AddVehicleView() {
        viewUtil = new ViewUtil();
        System.out.println("2. dodanie pojazdu do listy dostępnych pojazdów");
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

    public LocalDate getDateOfProduction() {
        System.out.println("Podaj datę produkcji");
        System.out.println("Rok:");

        Year year = getYear();
        System.out.println("Miesiąc:");
        Month month = getMonth();
        System.out.println("Dzień:");
        MonthDay day = getDay(month);
        LocalDate date = null;
        try {
            date = LocalDate.of(year.getValue(), month, day.getDayOfMonth());
            System.out.println(date);
        } catch (DateTimeException e) {
            System.out.println(e.getMessage());
            System.out.println("Podaj dzień jeszcze raz!");
            getDay(month);
        }
        return date;
    }

    private Year getYear() {
        Year year;
        while (true) {
            try {
                year = Year.parse(viewUtil.getStringValue());
                break;
            } catch (DateTimeParseException e) {
                System.out.println("Podałeś zły rok! Spróbuj jeszcze raz!");
            }
        }
        return year;
    }

    private Month getMonth() {
        Month month;
        while (true) {
            try {
                month = Month.of(viewUtil.getIntegerValue());
                break;
            } catch (DateTimeException e) {
                System.out.println("Podałeś zły miesiąc! Spróbuj jeszcze raz!");
            }
        }
        return month;
    }

    private MonthDay getDay(Month month) {
        MonthDay day;
        while (true) {
            try {
                day = MonthDay.of(month, viewUtil.getIntegerValue());
                break;
            } catch (DateTimeException e) {
                System.out.println("Podałeś zły dzień! Spróbuj jeszcze raz!");
            }
        }
        return day;
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

    public void showPlaces() {
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
