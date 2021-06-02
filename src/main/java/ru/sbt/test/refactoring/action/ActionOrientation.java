package ru.sbt.test.refactoring.action;

import ru.sbt.test.refactoring.command.Orientation;

public interface ActionOrientation {

    default Orientation turnClockwise(Orientation orientation) {
        return orientation.turnRight();
    }

    default Orientation turnCounterclockwise(Orientation orientation) {
        return orientation.turnLeft();
    }

    public Orientation getOrientation();

    public void setOrientation(Orientation orientation);
}
