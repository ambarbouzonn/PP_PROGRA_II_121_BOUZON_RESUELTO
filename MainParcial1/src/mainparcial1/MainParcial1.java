package mainparcial1;

public class MainParcial1 {

    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        try {
            // Agregamos una publicación
            Publicacion libro1 = new Libro("Cien años de soledad", 1967, "Gabriel Garcia Marquez", GENERO.FICCION);
            biblioteca.agregarPublicacion(libro1);

            // Agregamos una revista
            Publicacion revista1 = new Revista("National Geographic", 2023, 125);
            biblioteca.agregarPublicacion(revista1);

            // Agregamos una ilustración
            Publicacion ilustracion1 = new Ilustracion("Mona Lisa", 1503, "Leonardo da Vinci", 77, 53);
            biblioteca.agregarPublicacion(ilustracion1);

            // Intentamos agregar el mismo libro para provocar la excepción
            biblioteca.agregarPublicacion(revista1);  // Esto debería lanzar PublicacionDuplicadaException

        } catch (PublicacionDuplicadaException e) {
            System.out.println("Excepción lanzada: " + e.getMessage());
        }

        // Mostrar todas las publicaciones en la biblioteca
        System.out.println("\nPublicaciones en la biblioteca:");
        biblioteca.mostrarPublicaciones();

        // Leer las publicaciones
        System.out.println("\nLeyendo publicaciones:");
        biblioteca.leerPublicaciones();
    }
}
