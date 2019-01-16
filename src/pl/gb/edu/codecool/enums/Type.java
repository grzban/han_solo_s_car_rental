package pl.gb.edu.codecool.enums;

public enum Type {
    GROUND_RIDING(1),
    GROUND_WALKING(2),
    FLYING_FIGHTER(3),
    FLYING_TROOP_SHIP(4);

    private int typeId;

    Type(int typeId) {
        this.typeId = typeId;
    }

    public int getTypeId() {
        return typeId;
    }

    @Override
    public String toString() {
        return "|\t" + typeId + "\t|\t" + name() + "\t|";
    }
}
