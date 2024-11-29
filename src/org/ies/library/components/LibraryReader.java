package org.ies.library.components;

import org.ies.library.model.Biblioteca;
import org.ies.library.model.Book;

import java.util.Scanner;

public class LibraryReader {
    private final Scanner scanner;
    private final BookReader bookReader;

    public LibraryReader (Scanner scanner, BookReader bookReader) {
        this.scanner = scanner;
        this.bookReader = bookReader;
    }
    public Biblioteca read() {
        System.out.println("Escribe los datros de la biblioteca");
        System.out.println("Nombre");
        String name = scanner.nextLine();
        System.out.println("Cuantos libros tiene");
        int size = scanner.nextInt();

        Book[] books = new Book[size];
        for (int i = 0; i < books.length; i++) {
            books[i] = bookReader.read();
        }
        return new Biblioteca(
                name,
                books
        );
    }

}
