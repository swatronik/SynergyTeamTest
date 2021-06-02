package ru.sbt.test.refactoring.command;

import ru.sbt.test.refactoring.exception.ExceptionCommand;

public class Fire implements Command {

    public static Integer shoot(Integer countBullet) {
        if (countBullet > 0) {
            return countBullet - 1;
        } else {
            throw ExceptionCommand.buildExceptionFire();
        }
    }
}
