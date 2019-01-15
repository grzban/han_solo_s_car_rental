package pl.gb.edu.codecool.resource;

import pl.gb.edu.codecool.model.Type;

public class ExampleType {

    private TypeResource typeResource;

    public ExampleType() {
        typeResource = new TypeResource();
        typeResource.addType(typeExample1());
        typeResource.addType(typeExample2());
        typeResource.addType(typeExample3());
        typeResource.addType(typeExample4());
    }

    private Type typeExample1() {
        return new Type(1, "GROUND_RIDING");
    }

    private Type typeExample2() {
        return new Type(1, "GROUND_WALKING");
    }

    private Type typeExample3() {
        return new Type(1, "FLYING_FIGHTER");
    }

    private Type typeExample4() {
        return new Type(1, "FLYING_TROOP_SHIP");
    }

    public TypeResource getTypeResource() {
        return typeResource;
    }
}
