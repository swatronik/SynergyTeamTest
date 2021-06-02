package ru.sbt.test.refactoring.action;

import ru.sbt.test.refactoring.battlefield.Coordinates;

public interface ActionPosition {

    public Coordinates getPosition();

    public void setPosition(Coordinates coordinates);
}
