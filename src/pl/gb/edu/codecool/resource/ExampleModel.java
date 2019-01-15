package pl.gb.edu.codecool.resource;

import pl.gb.edu.codecool.model.Model;

public class ExampleModel {
    private ModelResource modelResource;

    public ExampleModel() {
        modelResource = new ModelResource();
        modelResource.addModel(modelExample1());
        modelResource.addModel(modelExample2());
    }

    Model modelExample1() {
        return new Model(1, "Model 1");
    }

    Model modelExample2() {
        return new Model(2, "Model 2");
    }

    public ModelResource getModelResource() {
        return modelResource;
    }
}
