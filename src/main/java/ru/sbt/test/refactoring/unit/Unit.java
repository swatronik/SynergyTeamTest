package ru.sbt.test.refactoring.unit;

import ru.sbt.test.refactoring.battlefield.Battlefield;

public interface Unit {

    public Battlefield getBattlefield();

    public void setBattlefield(Battlefield battlefield);
}
