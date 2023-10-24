package org.experis.task;

import java.io.IOException;

public class OutOfSlotsException extends LibraryException {
    public OutOfSlotsException(String message) {
        super(message);
    }
}
