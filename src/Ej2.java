/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Usuario
 */

    import java.util.Scanner;

public class Ej2 {

    // Clase Mascota
    static class Mascota {
        String nombre;
        String especie;
        int edad;

        public Mascota(String nombre, String especie, int edad) {
            this.nombre = nombre;
            this.especie = especie;
            this.edad = edad;
        }

        // Método para mostrar información
        public void mostrarInfo() {
            System.out.println("Nombre: " + nombre);
            System.out.println("Especie: " + especie);
            System.out.println("Edad: " + edad);
            System.out.println("-----------------------");
        }

        // Método para cumplir años (aumenta la edad en 1)
        public void cumplirAnios() {
            edad++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Crear mascota
        System.out.print("Nombre de la mascota: ");
        String nombre = sc.nextLine();

        System.out.print("Especie: ");
        String especie = sc.nextLine();

        System.out.print("Edad: ");
        int edad = sc.nextInt();

        Mascota m = new Mascota(nombre, especie, edad);

        // Mostrar información inicial
        System.out.println("\nInformación inicial de la mascota:");
        m.mostrarInfo();

        // Simular el paso de un año
        System.out.println("Simulando que la mascota cumple un año...");
        m.cumplirAnios();

        // Mostrar información después de cumplir años
        System.out.println("\nInformación después de cumplir años:");
        m.mostrarInfo();

        sc.close();
    }
}


