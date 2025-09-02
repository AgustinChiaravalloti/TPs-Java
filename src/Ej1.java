/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Usuario
 */

    import java.util.Scanner;

public class Ej1 {

    // Clase Estudiante
    static class Estudiante {
        String nombre;
        String apellido;
        String curso;
        double calificacion;

        public Estudiante(String nombre, String apellido, String curso, double calificacion) {
            this.nombre = nombre;
            this.apellido = apellido;
            this.curso = curso;
            this.calificacion = calificacion;
        }

        // Método para mostrar información
        public void mostrarInfo() {
            System.out.println("Nombre: " + nombre + " " + apellido);
            System.out.println("Curso: " + curso);
            System.out.println("Calificación: " + calificacion);
            System.out.println("-----------------------");
        }

        // Método para subir calificación
        public void subirCalificacion(double puntos) {
            calificacion += puntos;
        }

        // Método para bajar calificación
        public void bajarCalificacion(double puntos) {
            calificacion -= puntos;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Crear estudiante
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Apellido: ");
        String apellido = sc.nextLine();

        System.out.print("Curso: ");
        String curso = sc.nextLine();

        System.out.print("Calificación inicial: ");
        double calificacion = sc.nextDouble();

        Estudiante e = new Estudiante(nombre, apellido, curso, calificacion);

        System.out.println("\nInformación inicial del estudiante:");
        e.mostrarInfo();

        // Subir calificación
        System.out.print("Ingrese puntos a subir: ");
        double subir = sc.nextDouble();
        e.subirCalificacion(subir);
        System.out.println("\nDespués de subir calificación:");
        e.mostrarInfo();

        // Bajar calificación
        System.out.print("Ingrese puntos a bajar: ");
        double bajar = sc.nextDouble();
        e.bajarCalificacion(bajar);
        System.out.println("\nDespués de bajar calificación:");
        e.mostrarInfo();

        sc.close();
    }
}


