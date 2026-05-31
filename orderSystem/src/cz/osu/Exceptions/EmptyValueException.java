package cz.osu.Exceptions;

public class EmptyValueException extends RuntimeException {
    public EmptyValueException(String message) {
        super(message);
    }
}