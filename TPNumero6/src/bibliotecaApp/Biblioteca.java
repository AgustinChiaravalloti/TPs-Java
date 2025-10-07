/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bibliotecaApp;

/**
 *
 * @author Usuario
 */
import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private String nombre;
    private List<Libro> libros;

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.libros = new ArrayList<>();
    }

    public void agregarLibro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        Libro nuevo = new Libro(isbn, titulo, anioPublicacion, autor);
        libros.add(nuevo);
    }

    public void listarLibros() {
        if (libros.isEmpty()) {
            System.out.println("No hay libros en la biblioteca.");
        } else {
            System.out.println("Libros en la biblioteca '" + nombre + "':");
            for (Libro libro : libros) {
                libro.mostrarInfo();
            }
        }
    }

    public Libro buscarLibroPorIsbn(String isbn) {
        for (Libro libro : libros) {
            if (libro.getIsbn().equalsIgnoreCase(isbn)) {
                return libro;
            }
        }
        return null;
    }

    public void eliminarLibro(String isbn) {
        Libro libro = buscarLibroPorIsbn(isbn);
        if (libro != null) {
            libros.remove(libro);
            System.out.println("Libro con ISBN " + isbn + " eliminado.");
        } else {
            System.out.println("No se encontró el libro con ese ISBN.");
        }
    }

    public int obtenerCantidadLibros() {
        return libros.size();
    }

    public void filtrarLibrosPorAnio(int anio) {
        System.out.println("Libros publicados en el año " + anio + ":");
        boolean encontrado = false;
        for (Libro libro : libros) {
            if (libro.getAnioPublicacion() == anio) {
                libro.mostrarInfo();
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No hay libros de ese año.");
        }
    }

    public void mostrarAutoresDisponibles() {
        System.out.println("Autores de los libros disponibles:");
        List<String> autoresMostrados = new ArrayList<>();
        for (Libro libro : libros) {
            String nombreAutor = libro.getAutor().getNombre();
            if (!autoresMostrados.contains(nombreAutor)) {
                System.out.println("- " + nombreAutor);
                autoresMostrados.add(nombreAutor);
            }
        }
    }
}
