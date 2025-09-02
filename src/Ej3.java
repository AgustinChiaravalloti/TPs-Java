/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Usuario
 */

    import java.util.Scanner;

public class Ej3 {

    // Clase Libro con encapsulamiento
    static class Libro {
        private String titulo;
        private String autor;
        private int anioPublicacion;

        // Constructor
        public Libro(String titulo, String autor, int anioPublicacion) {
            this.titulo = titulo;
            this.autor = autor;
            setAnioPublicacion(anioPublicacion); // Validación al crear
        }

        // Getters
        public String getTitulo() {
            return titulo;
        }

        public String getAutor() {
            return autor;
        }

        public int getAnioPublicacion() {
            return anioPublicacion;
        }

        // Setter con validación para año de publicación
        public void setAnioPublicacion(int anio) {
            if (anio > 0) {
                this.anioPublicacion = anio;
            } else {
                System.out.println("Año inválido, no se actualizó.");
            }
        }

        // Método para mostrar información del libro
        public void mostrarInfo() {
            System.out.println("Título: " + titulo);
            System.out.println("Autor: " + autor);
            System.out.println("Año de publicación: " + anioPublicacion);
            System.out.println("-----------------------");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Crear libro
        System.out.print("Título del libro: ");
        String titulo = sc.nextLine();

        System.out.print("Autor: ");
        String autor = sc.nextLine();

        System.out.print("Año de publicación: ");
        int anio = sc.nextInt();

        Libro libro = new Libro(titulo, autor, anio);

        System.out.println("\nInformación inicial del libro:");
        libro.mostrarInfo();

        // Intentar modificar con año inválido
        System.out.print("Intentar cambiar el año a un valor inválido (-2025): ");
        libro.setAnioPublicacion(-2025);

        // Intentar modificar con año válido
        System.out.print("Cambiar el año a 2025: ");
        libro.setAnioPublicacion(2025);

        // Mostrar información final
        System.out.println("\nInformación final del libro:");
        libro.mostrarInfo();

        sc.close();
    }
}


