package ru.sbt.test.refactoring.exception;

public class ExceptionCommand extends RuntimeException {

    public static RuntimeException buildExceptionOrientation() {
        return new RuntimeException("Error. Don't support orientation.");
    }

    public static RuntimeException buildExceptionMove() {
        return new RuntimeException("Error. Move impossible.");
    }

    public static RuntimeException buildExceptionFire() {
        return new RuntimeException("Error. Shoot impossible.");
    }
}
