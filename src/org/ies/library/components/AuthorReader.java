package org.ies.library.components;

import org.ies.library.model.Autor;

import java.util.Scanner;

public class AuthorReader {
    private final Scanner scanner;

    public AuthorReader(Scanner scanner) {
        this.scanner = scanner;
    }

    public Autor read() {
        System.out.println("Introduce los datos del autor");
        System.out.println("NIF");
        String nif = scanner.nextLine();
        System.out.println("Nombre");
        String name = scanner.nextLine();
        System.out.println("Apellidos");
        String surname = scanner.nextLine();

        return new Autor(
                nif,
                name,
                surname
        );
    }


}
