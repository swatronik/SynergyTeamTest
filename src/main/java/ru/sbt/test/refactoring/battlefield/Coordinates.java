package ru.sbt.test.refactoring.battlefield;

public class Coordinates {

    private final int X;
    private final int Y;

    public Coordinates(int X, int Y) {
        this.X = X;
        this.Y = Y;
    }

    public int getX() {
        return X;
    }

    public int getY() {
        return Y;
    }

    @Override
    public boolean equals(Object obj) {
        Coordinates coordinates = (Coordinates) obj;
        if (coordinates == null) return false;
        return this.X == coordinates.X && this.Y == coordinates.Y;
    }
}
