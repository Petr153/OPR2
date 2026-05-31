package cz.osu.Exceptions;

public class ShortProductNameException extends RuntimeException {
    public ShortProductNameException(String message) {
        super(message);
    }
}
