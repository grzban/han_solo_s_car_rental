package pl.gb.edu.codecool.model;

import java.util.Objects;

public class Model {

    private int modelId;
    private String modelName;

    public Model(int modelId, String modelName) {
        this.modelId = modelId;
        this.modelName = modelName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Model model = (Model) o;
        return modelId == model.modelId &&
                modelName.equals(model.modelName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(modelId, modelName);
    }

    @Override
    public String toString() {
        return "|\t" + modelId + "\t|\t" + modelName + "\t|\n";
    }
}
