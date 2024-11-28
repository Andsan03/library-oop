package org.ies.library.model;

import java.util.Objects;

public class Autor {
    private String nif;
    private String nombre;
    private String apellido;

    public Autor(String nif, String nombre, String apellido) {
        this.nif = nif;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Autor autor = (Autor) o;
        return Objects.equals(nif, autor.nif) && Objects.equals(nombre, autor.nombre) && Objects.equals(apellido, autor.apellido);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nif, nombre, apellido);
    }

    @Override
    public String toString() {
        return "Autor{" +
                "nif='" + nif + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                '}';
    }
}
