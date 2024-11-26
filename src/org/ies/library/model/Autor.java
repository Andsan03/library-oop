package org.ies.library.model;

import java.util.Objects;

public class Autor {
    private String NIF;
    private String Nombre;
    private String Apellido;

    public Autor(String apellido, String NIF, String nombre) {
        this.Apellido = apellido;
        this.NIF = NIF;
        this.Nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        this.Apellido = apellido;
    }

    public String getNIF() {
        return NIF;
    }

    public void setNIF(String NIF) {
        this.NIF = NIF;
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
        Autor autor = (Autor) o;
        return Objects.equals(NIF, autor.NIF) && Objects.equals(Nombre, autor.Nombre) && Objects.equals(Apellido, autor.Apellido);
    }

    @Override
    public int hashCode() {
        return Objects.hash(NIF, Nombre, Apellido);
    }

    @Override
    public String toString() {
        return "Autor{" +
                "Apellido='" + Apellido + '\'' +
                ", NIF='" + NIF + '\'' +
                ", Nombre='" + Nombre + '\'' +
                '}';
    }
}
