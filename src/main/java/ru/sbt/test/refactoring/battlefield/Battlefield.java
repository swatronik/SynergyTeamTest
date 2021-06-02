package ru.sbt.test.refactoring.battlefield;

import ru.sbt.test.refactoring.exception.ExceptionCommand;
import ru.sbt.test.refactoring.unit.Unit;

public class Battlefield {

    private final int X;
    private final int Y;

    private final Unit[][] map;

    public Battlefield(int X, int Y) {
        this.X = X;
        this.Y = Y;
        this.map = new Unit[X][Y];
    }

    public Boolean isCellEmpty(Coordinates coordinates) {
        return map[coordinates.getX()][coordinates.getY()] == null;
    }

    public Boolean isCoordinateValid(Coordinates coordinates) {
        return (coordinates.getX() < X && coordinates.getY() < Y) && (coordinates.getX() >= 0 && coordinates.getY() >= 0);
    }

    public void move(Coordinates oldCoordinates, Coordinates newCoordinates) {
        if (isCoordinateValid(newCoordinates) && isCellEmpty(newCoordinates)) {
            map[newCoordinates.getX()][newCoordinates.getY()] = map[oldCoordinates.getX()][oldCoordinates.getY()];
            map[oldCoordinates.getX()][oldCoordinates.getY()] = null;
        } else {
            throw new ExceptionCommand();
        }
    }

    public void placeUnit(Unit unit, Coordinates coordinates) {
        if (isCellEmpty(coordinates) && isCoordinateValid(coordinates)) {
            map[coordinates.getX()][coordinates.getY()] = unit;
        }
    }
}
