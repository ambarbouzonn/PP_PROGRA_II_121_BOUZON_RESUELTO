package mainparcial1;

public class Libro extends Publicacion implements Leible {
    private String autor;
    private GENERO genero;

    public Libro(String titulo, int anio, String autor, GENERO genero) {
        super(titulo, anio);
        this.autor = autor;
        this.genero = genero;
    }

    @Override
    public void leer() {
        System.out.println("Leyendo el libro: " + titulo);
    }

    @Override
    public String toString() {
        return "Libro [Titulo=" + titulo + ", Año=" + anio + ", Autor=" + autor + ", Género=" + genero + "]";
    }
}
