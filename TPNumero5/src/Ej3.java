/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Usuario
 */
public class Ej3 {
   
    public static void main(String[] args) {
        Autor autor = new Autor("Gabriel García Márquez", "Colombiana");
        Editorial editorial = new Editorial("Editorial Sudamericana", "Buenos Aires");
        Libro libro = new Libro("Cien años de soledad", "978-0307474728", autor, editorial);

        System.out.println("Libro: " + libro.titulo + " (ISBN: " + libro.isbn + ")");
        System.out.println("Autor: " + libro.autor.nombre + " - " + libro.autor.nacionalidad);
        System.out.println("Editorial: " + libro.editorial.nombre + " - " + libro.editorial.direccion);
    }
}

class Autor {
    String nombre;
    String nacionalidad;

    public Autor(String nombre, String nacionalidad) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }
}

class Editorial {
    String nombre;
    String direccion;

    public Editorial(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }
}

class Libro {
    String titulo;
    String isbn;
    Autor autor;        // asociación unidireccional
    Editorial editorial; // agregación

    public Libro(String titulo, String isbn, Autor autor, Editorial editorial) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.autor = autor;
        this.editorial = editorial;
    }
}


