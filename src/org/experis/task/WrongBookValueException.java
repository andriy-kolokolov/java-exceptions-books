package org.experis.task;

public class WrongBookValueException extends LibraryException{
    public WrongBookValueException(String message) {
        super(message);
    }
}
