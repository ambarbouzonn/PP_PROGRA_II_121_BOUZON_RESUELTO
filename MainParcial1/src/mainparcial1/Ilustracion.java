package mainparcial1;

public class Ilustracion extends Publicacion {
    private String nombreIlustrador;
    private double ancho;
    private double alto;

    public Ilustracion(String titulo, int anio, String nombreIlustrador, double ancho, double alto) {
        super(titulo, anio);
        this.nombreIlustrador = nombreIlustrador;
        this.ancho = ancho;
        this.alto = alto;
    }

    @Override
    public String toString() {
        return "Ilustracion [Titulo=" + titulo + ", Año=" + anio + ", Ilustrador=" + nombreIlustrador +
               ", Dimensiones=" + ancho + "x" + alto + "]";
    }
}
