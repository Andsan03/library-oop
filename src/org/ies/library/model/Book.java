package org.ies.library.model;

import java.util.Arrays;
import java.util.Objects;

public class Book {
    private String ISBN;
    private String Titulo;
    private int Año;
    private Autor[] Autor;

    public Book(Autor[] autor, int año, String ISBN, String titulo) {
        this.Autor = autor;
        this.Año = año;
        this.ISBN = ISBN;
        this.Titulo = titulo;
    }

    public org.ies.library.model.Autor[] getAutor() {
        return Autor;
    }

    public void setAutor(Autor[] autor) {
        this.Autor = autor;
    }

    public int getAño() {
        return Año;
    }

    public void setAño(int año) {
        this.Año = año;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        this.Titulo = titulo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Año == book.Año && Objects.equals(ISBN, book.ISBN) && Objects.equals(Titulo, book.Titulo) && Objects.deepEquals(Autor, book.Autor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ISBN, Titulo, Año, Arrays.hashCode(Autor));
    }

    @Override
    public String toString() {
        return "Book{" +
                "Autor=" + Arrays.toString(Autor) +
                ", ISBN='" + ISBN + '\'' +
                ", Titulo='" + Titulo + '\'' +
                ", Año=" + Año +
                '}';
    }
}

