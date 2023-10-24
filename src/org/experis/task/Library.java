package org.experis.task;

import org.experis.task.Util.LibraryUtil;

import java.util.ArrayList;

public class Library {

    private int availableSlots;
    private int booksCount;
    private ArrayList<Book> storage;

    public Library(int availableSlots) {
        this.availableSlots = availableSlots;
        this.booksCount = 0;
        this.storage = new ArrayList<>();
    }

    public Library() {
    }

    public void insert(Book book) throws LibraryException {
        LibraryUtil.validateValues(book);
        LibraryUtil.validateAvailableSlots(this);
        storage.add(book);
        availableSlots--;
        booksCount++;
    }

    public int getAvailableSlots() {
        return availableSlots;
    }

    public int getBooksCount() {
        return booksCount;
    }

    public ArrayList<Book> getStorage() {
        return storage;
    }
}
