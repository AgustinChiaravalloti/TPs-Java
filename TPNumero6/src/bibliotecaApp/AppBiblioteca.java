/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bibliotecaApp;

/**
 *
 * @author Usuario
 */
public class AppBiblioteca {
    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca("Biblioteca Central");

        // Crear autores
        Autor autor1 = new Autor("A1", "Gabriel García Márquez", "Colombia");
        Autor autor2 = new Autor("A2", "J.K. Rowling", "Reino Unido");
        Autor autor3 = new Autor("A3", "Ernest Hemingway", "EE.UU.");

        // Agregar libros
        biblioteca.agregarLibro("ISBN001", "Cien años de soledad", 1967, autor1);
        biblioteca.agregarLibro("ISBN002", "Harry Potter y la piedra filosofal", 1997, autor2);
        biblioteca.agregarLibro("ISBN003", "Harry Potter y la cámara secreta", 1998, autor2);
        biblioteca.agregarLibro("ISBN004", "El viejo y el mar", 1952, autor3);
        biblioteca.agregarLibro("ISBN005", "Crónica de una muerte anunciada", 1981, autor1);

        // Listar todos los libros
        biblioteca.listarLibros();

        // Buscar libro por ISBN
        System.out.println("\n🔎 Buscando libro con ISBN 'ISBN002':");
        Libro encontrado = biblioteca.buscarLibroPorIsbn("ISBN002");
        if (encontrado != null) {
            encontrado.mostrarInfo();
        } else {
            System.out.println("No se encontró el libro.");
        }

        // Filtrar libros por año
        System.out.println("\n📅 Filtrando libros del año 1998:");
        biblioteca.filtrarLibrosPorAnio(1998);

        // Eliminar un libro
        System.out.println("\n🗑️ Eliminando libro con ISBN 'ISBN003':");
        biblioteca.eliminarLibro("ISBN003");

        // Listar libros restantes
        System.out.println("\n📖 Libros restantes:");
        biblioteca.listarLibros();

        // Mostrar cantidad total
        System.out.println("\n📊 Cantidad total de libros: " + biblioteca.obtenerCantidadLibros());

        // Mostrar autores disponibles
        System.out.println("\n👩‍💼 Autores disponibles:");
        biblioteca.mostrarAutoresDisponibles();
    }
}
