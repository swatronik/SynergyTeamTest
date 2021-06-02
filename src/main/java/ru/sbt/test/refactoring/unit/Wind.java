package ru.sbt.test.refactoring.unit;

import ru.sbt.test.refactoring.action.ActionOrientation;
import ru.sbt.test.refactoring.battlefield.Battlefield;
import ru.sbt.test.refactoring.command.Orientation;

public class Wind implements Unit, ActionOrientation {

    private Orientation orientation;
    private Battlefield battlefield;

    @Override
    public Orientation getOrientation() {
        return orientation;
    }

    @Override
    public void setOrientation(Orientation orientation) {
        this.orientation = orientation;
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
