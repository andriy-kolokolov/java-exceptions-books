package org.experis.task.Util;

import org.experis.task.Book;
import org.experis.task.Library;
import org.experis.task.OutOfSlotsException;
import org.experis.task.WrongBookValueException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class LibraryUtil {

    public static void validateValues(Book book) throws WrongBookValueException {
        if (book.getTitle() == null || book.getTitle().isEmpty())
            throw new WrongBookValueException("Page title can't be empty.");
        if (book.getPages() == null || book.getPages() == 0)
            throw new WrongBookValueException("Pages can't be null or equals to 0.");
        if (book.getAuthor() == null || book.getAuthor().isEmpty())
            throw new WrongBookValueException("Author can't be empty.");
        if (book.getEditor() == null || book.getEditor().isEmpty())
            throw new WrongBookValueException("Editor can't be empty.");

    }

    public static void validateAvailableSlots(Library library) throws OutOfSlotsException {
        if (library.getAvailableSlots() == 0)
            throw new OutOfSlotsException("No more slots available in library.");
    }

    public static void exportToTxt(Library library) {
        try (PrintWriter out = new PrintWriter("library_export.txt")) {
            for (Book book : library.getStorage()) {
                out.println("Title: " + book.getTitle());
                out.println("Pages: " + book.getPages());
                out.println("Author: " + book.getAuthor());
                out.println("Editor: " + book.getEditor());
                out.println("------------------------");
            }
        } catch (FileNotFoundException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }
}
