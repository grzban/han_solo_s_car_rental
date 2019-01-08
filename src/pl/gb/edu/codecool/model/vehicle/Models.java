package pl.gb.edu.codecool.model.vehicle;

import java.util.HashSet;
import java.util.Set;

public class Models {
    Set<Model> models;

    public Models() {
        models = new HashSet<>();
    }

    public void addModel(Model model) {
        models.add(model);
    }

    public void removeModel(Model model) {
        models.remove(model);
    }

    public void updateModel(Model oldModel, Model newModel) {
        models.remove(oldModel);
        models.add(newModel);
    }

    /*public Model getModel(int modelId) {
    }*/
}
