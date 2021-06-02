package ru.sbt.test.refactoring.action;

import ru.sbt.test.refactoring.battlefield.Battlefield;
import ru.sbt.test.refactoring.battlefield.Coordinates;
import ru.sbt.test.refactoring.command.Move;
import ru.sbt.test.refactoring.command.Orientation;

public interface ActionMove extends ActionPosition, ActionOrientation {

    default Coordinates moveForwards(Coordinates coordinates, Orientation orientation, Battlefield battlefield) {
        return Move.forward(coordinates, orientation, battlefield);
    }
}
