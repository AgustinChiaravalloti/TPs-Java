/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Usuario
 */
public class Main {
    
    public static void main(String[] args) {
        // Crear empleados usando el constructor completo
        Empleados e1 = new Empleados(100, "Juan Pérez", "Gerente", 120000);
        Empleados e2 = new Empleados(101, "Ana López", "Analista", 80000);

        // Crear empleados usando el constructor con nombre y puesto
        Empleados e3 = new Empleados("Carlos Gómez", "Programador");
        Empleados e4 = new Empleados("Lucía Torres", "Diseñadora");

        // Aplicar aumentos de salario
        e2.actualizarSalario(10);     // Aumento del 10%
        e3.actualizarSalario(5000);   // Aumento fijo de $5000

        // Mostrar información de empleados
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
        System.out.println(e4);

        // Mostrar total de empleados creados
        System.out.println("\nTotal de empleados: " + Empleados.mostrarTotalEmpleados());
    }
}


