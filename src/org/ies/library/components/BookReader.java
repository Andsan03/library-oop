package org.ies.library.components;

import org.ies.library.model.Autor;
import org.ies.library.model.Book;

import java.util.Scanner;

public class BookReader {
    private final Scanner scanner;
    private final AuthorReader authorReader;

    public BookReader (Scanner scanner, AuthorReader authorReader) {
        this.scanner = scanner;
        this.authorReader = authorReader;
    }

    public Book read() {
        System.out.println("Introduce los datos del libro");
        System.out.println("ISBN");
        String isbn = scanner.nextLine();
        System.out.println("Titulo");
        String title = scanner.nextLine();
        System.out.println("Año");
        int year = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Cuantos autores tiene");
        int size = scanner.nextInt();
        scanner.nextLine();

        Autor[] authors = new Autor[size];
        for (int i = 0; i < authors.length; i++) {
            authors[i] = authorReader.read();
        }
        return new Book(
                isbn,
                title,
                year,
                authors
        );
    }
}
