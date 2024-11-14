package mainparcial1;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Publicacion> publicaciones = new ArrayList<>();

    public void agregarPublicacion(Publicacion publicacion) throws PublicacionDuplicadaException {
        if (publicaciones.contains(publicacion)) {
            throw new PublicacionDuplicadaException("La publicación ya existe: " + publicacion.getTitulo());
        }
        publicaciones.add(publicacion);
    }

    public void mostrarPublicaciones() {
        for (Publicacion publicacion : publicaciones) {
            System.out.println(publicacion);
        }
    }

    public void leerPublicaciones() {
        for (Publicacion publicacion : publicaciones) {
            if (publicacion instanceof Leible) {
                ((Leible) publicacion).leer();
            } else {
                System.out.println("La publicación no es leíble: " + publicacion.getTitulo());
            }
        }
    }
}
