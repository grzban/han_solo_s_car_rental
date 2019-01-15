package pl.gb.edu.codecool.resource;

import pl.gb.edu.codecool.model.Model;

import java.util.HashSet;
import java.util.Set;

public class ModelResource {
    private Set<Model> models;

    public ModelResource() {
        models = new HashSet<>();
    }

    public void addModel(Model model) {
        models.add(model);
    }

    public Set<Model> getModels() {
        return models;
    }
}
