package ru.sbt.test.refactoring.command;

import ru.sbt.test.refactoring.action.ActionFire;
import ru.sbt.test.refactoring.action.ActionMove;
import ru.sbt.test.refactoring.action.ActionOrientation;
import ru.sbt.test.refactoring.unit.Unit;

public class CommandDispatcher {

    public static void dispatch(String command, Unit unit) {
        if (command.equals("F") && unit instanceof ActionMove) {
            ActionMove unitActionMove = (ActionMove) unit;
            unitActionMove.setPosition(unitActionMove.moveForwards(unitActionMove.getPosition(), unitActionMove.getOrientation(), unit.getBattlefield()));
        } else if (command.equals("T") && unit instanceof ActionOrientation) {
            ActionOrientation unitActionOrientation = (ActionOrientation) unit;
            unitActionOrientation.setOrientation(unitActionOrientation.turnClockwise(unitActionOrientation.getOrientation()));
        } else if (command.equals("S") && unit instanceof ActionFire) {
            ActionFire unitActionFire = (ActionFire) unit;
            unitActionFire.setNumberBullet(unitActionFire.shoot(unitActionFire.getCountBullet()));
        }
    }
}
