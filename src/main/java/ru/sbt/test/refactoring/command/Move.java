package ru.sbt.test.refactoring.command;

import ru.sbt.test.refactoring.battlefield.Battlefield;
import ru.sbt.test.refactoring.battlefield.Coordinates;

public class Move implements Command {

    public static Coordinates forward(Coordinates oldCoordinates, Orientation orientation, Battlefield battlefield) {
        Coordinates deltaCoordinates = orientation.ofDeltaMove();
        Coordinates newCoordinates = new Coordinates(oldCoordinates.getX() + deltaCoordinates.getX(), oldCoordinates.getY() + deltaCoordinates.getY());

        battlefield.move(oldCoordinates, newCoordinates);
        return newCoordinates;
    }
}
