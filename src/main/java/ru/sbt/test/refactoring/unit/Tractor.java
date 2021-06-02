package ru.sbt.test.refactoring.unit;

import ru.sbt.test.refactoring.action.ActionMove;
import ru.sbt.test.refactoring.battlefield.Battlefield;
import ru.sbt.test.refactoring.battlefield.Coordinates;
import ru.sbt.test.refactoring.command.Orientation;

public class Tractor implements Unit, ActionMove {

	private Coordinates coordinates;
	private Battlefield battlefield;
	private Orientation orientation = Orientation.NORTH;

	@Override
	public Orientation getOrientation() {
		return orientation;
	}

	@Override
	public void setOrientation(Orientation orientation) {
		this.orientation = orientation;
	}

	@Override
	public Coordinates getPosition() {
		return coordinates;
	}

	@Override
	public void setPosition(Coordinates coordinates) {
		this.coordinates = coordinates;
	}

	@Override
	public Battlefield getBattlefield() {
		return battlefield;
	}

	@Override
	public void setBattlefield(Battlefield battlefield) {
		this.battlefield = battlefield;
	}
}
