package mainparcial1;

import java.util.ArrayList;
import java.util.List;

abstract class Publicacion {
    protected String titulo;
    protected int anio;

    public Publicacion(String titulo, int anio) {
        this.titulo = titulo;
        this.anio = anio;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAnio() {
        return anio;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Publicacion that = (Publicacion) obj;
        return anio == that.anio && titulo.equals(that.titulo);
    }

    @Override
    public int hashCode() {
        return titulo.hashCode() + anio;
    }

    @Override
    public abstract String toString();
}
