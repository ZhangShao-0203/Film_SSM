package com.film.tools;

public class DuplicateSubmitException extends RuntimeException {
    public DuplicateSubmitException(String msg) {
        super(msg);
    }

    public DuplicateSubmitException(String msg, Throwable cause) {
        super(msg, cause);
    }
}
