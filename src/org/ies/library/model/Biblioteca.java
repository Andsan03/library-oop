package org.ies.library.model;

import java.util.Arrays;
import java.util.Objects;

public class Biblioteca {
    private String Nombre;
    private Book[] Libros;

    public Biblioteca(Book[] libros, String nombre) {
        this.Libros = libros;
        this.Nombre = nombre;
    }

    public Book[] getLibros() {
        return Libros;
    }

    public void setLibros(Book[] libros) {
        this.Libros = libros;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        this.Nombre = nombre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Biblioteca that = (Biblioteca) o;
        return Objects.equals(Nombre, that.Nombre) && Objects.deepEquals(Libros, that.Libros);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Nombre, Arrays.hashCode(Libros));
    }

    @Override
    public String toString() {
        return "Biblioteca{" +
                "Libros=" + Arrays.toString(Libros) +
                ", Nombre='" + Nombre + '\'' +
                '}';
    }
}
