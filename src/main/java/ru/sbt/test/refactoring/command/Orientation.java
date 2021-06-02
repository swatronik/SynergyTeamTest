package ru.sbt.test.refactoring.command;

import ru.sbt.test.refactoring.battlefield.Coordinates;
import ru.sbt.test.refactoring.exception.ExceptionCommand;

public enum Orientation implements Command {

	NORTH(0),
	EAST(1),
	SOUTH(2),
	WEST(3);

	private final int id;

	Orientation(int id) {this.id = id;}

	public Orientation turnLeft() {
		return turn(-1);
	}

	public Orientation turnRight() {
		return turn(1);
	}

	private Orientation turn(int value) {
		return ofOrientation((id + value + Orientation.values().length) % Orientation.values().length);
	}

	private Orientation ofOrientation(int id) {
		for(Orientation orientation: Orientation.values()) {
			if (orientation.id == id) return orientation;
		}
		throw ExceptionCommand.buildExceptionOrientation();
	}

	public Coordinates ofDeltaMove() {
		if (this == NORTH) return new Coordinates(0, 1);
		if (this == EAST) return new Coordinates(1, 0);
		if (this == SOUTH) return new Coordinates(0, -1);
		if (this == WEST) return new Coordinates(-1, 0);
		throw ExceptionCommand.buildExceptionOrientation();
	}
}
