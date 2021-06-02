package ru.sbt.test.refactoring.unit;

import ru.sbt.test.refactoring.action.ActionPosition;
import ru.sbt.test.refactoring.battlefield.Battlefield;
import ru.sbt.test.refactoring.battlefield.Coordinates;

public class Rock implements Unit, ActionPosition {

    private Coordinates coordinates;
    private Battlefield battlefield;

    @Override
    public Coordinates getPosition() {
        return coordinates;
    }

    @Override
    public void setPosition(Coordinates coordinates) {
        this.coordinates = coordinates;
    }

    @Override
    public Battlefield getBattlefield() {
        return battlefield;
    }

    @Override
    public void setBattlefield(Battlefield battlefield) {
        this.battlefield = battlefield;
    }
}
