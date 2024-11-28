package org.ies.library.model;

import java.util.Arrays;
import java.util.Objects;

public class Book {
    private String isbn;
    private String titulo;
    private int año;
    private Autor[] autor;

    public Book(String isbn, String titulo, int año, Autor[] autor) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.año = año;
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public Autor[] getAutor() {
        return autor;
    }

    public void setAutor(Autor[] autor) {
        this.autor = autor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return año == book.año && Objects.equals(isbn, book.isbn) && Objects.equals(titulo, book.titulo) && Objects.deepEquals(autor, book.autor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isbn, titulo, año, Arrays.hashCode(autor));
    }

    @Override
    public String toString() {
        return "Book{" +
                "isbn='" + isbn + '\'' +
                ", titulo='" + titulo + '\'' +
                ", año=" + año +
                ", autor=" + Arrays.toString(autor) +
                '}';
    }

    public boolean hasAuthor(String nif) {
        for (Autor author:autor) {
            if (author.getNif().equals(nif)){
                return true;
            }
        }
        return false;
    }
}

