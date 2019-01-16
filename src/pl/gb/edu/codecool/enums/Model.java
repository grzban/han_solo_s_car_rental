package pl.gb.edu.codecool.enums;

public enum Model {
    MODEL_1(1),
    MODEL_2(2);

    private int modelId;

    Model(int modelId) {
        this.modelId = modelId;
    }

    public int getModelId() {
        return modelId;
    }

    @Override
    public String toString() {
        return "|\t" + modelId + "\t|\t" + name() + "\t\t|";
    }
}
