package mainparcial1;

public class Revista extends Publicacion implements Leible {
    private int numeroEdicion;

    public Revista(String titulo, int anio, int numeroEdicion) {
        super(titulo, anio);
        this.numeroEdicion = numeroEdicion;
    }

    @Override
    public void leer() {
        System.out.println("Leyendo la revista: " + titulo);
    }

    @Override
    public String toString() {
        return "Revista [Titulo=" + titulo + ", Año=" + anio + ", Número de Edición=" + numeroEdicion + "]";
    }
}
