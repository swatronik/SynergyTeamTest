package ru.sbt.test.refactoring.action;

import ru.sbt.test.refactoring.command.Fire;

public interface ActionFire {

    default Integer shoot(Integer countBullet) {
        return Fire.shoot(countBullet);
    }

    public Integer getCountBullet();

    public void setNumberBullet(Integer countBullet);
}
