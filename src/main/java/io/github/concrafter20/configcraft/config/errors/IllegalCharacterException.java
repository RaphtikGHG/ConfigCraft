package io.github.concrafter20.configcraft.config.errors;

public class IllegalCharacterException extends RuntimeException {

    public IllegalCharacterException() {
        super();
    }

    public IllegalCharacterException(String s) {
        super(s);
    }

    public IllegalCharacterException(String s, Throwable t) {
        super(s, t);
    }

    public IllegalCharacterException(Throwable t) {
        super(t);
    }
}
