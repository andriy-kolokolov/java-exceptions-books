package org.experis.task;

import org.experis.task.Util.LibraryUtil;

import org.experis.task.LibraryException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library(2);
        Scanner sc = new Scanner(System.in);

        System.out.printf(
                "Library has %d available slots for your books \n", library.getAvailableSlots()
        );

        while (true) {
            System.out.println("Add new book ? yes/no: ");
            if (sc.nextLine().equalsIgnoreCase("yes")) {

                try {
                    LibraryUtil.validateAvailableSlots(library);

                    Book book = new Book();

                    System.out.println("Title: ");
                    book.setTitle(sc.nextLine());

                    System.out.println("Pages: ");
                    while (book.getPages() == null) {
                        try {  // handle case when user types not integer value
                            book.setPages(sc.nextInt());
                            sc.nextLine(); // to consume the newline character
                        } catch (InputMismatchException e) {
                            System.err.println("Please enter a valid integer for the number of pages:");
                            sc.nextLine(); // consume the invalid input
                        }
                    }
                    System.out.println("Author: ");
                    book.setAuthor(sc.nextLine());

                    System.out.println("Editor: ");
                    book.setEditor(sc.nextLine());

                    library.insert(book);

                } catch (LibraryException e) {
                    System.err.println("Library error occurred : " + e.getMessage());
                    e.printStackTrace();
                    break;
                }
            } else {
                System.out.println("Bye!");
                break;
            }

            if (library.getAvailableSlots() == 0) {
                System.out.println("[WARN] : Library is full");
            }
        }
        sc.close();
    }
}
