package pl.gb.edu.codecool.resource;

import pl.gb.edu.codecool.model.Type;

import java.util.HashSet;
import java.util.Set;

public class TypeResource {
    private Set<Type> typeResource;

    public TypeResource() {
        typeResource = new HashSet<>();
    }

    public void addType(Type model) {
        typeResource.add(model);
    }

    public Set<Type> getTypeResource() {
        return typeResource;
    }
}
