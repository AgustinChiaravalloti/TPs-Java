/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Usuario
 */
public class Empleados {
    
    // Atributos de instancia
    private int id;
    private String nombre;
    private String puesto;
    private double salario;

    // Atributo estático (compartido por todos los objetos)
    private static int totalEmpleados = 0;

    // Atributo estático para generar ids automáticos
    private static int contadorId = 1;

    // Constructor que recibe todos los atributos
    public Empleados(int id, String nombre, String puesto, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        totalEmpleados++;
    }

    // Constructor sobrecargado que recibe solo nombre y puesto
    public Empleados(String nombre, String puesto) {
        this.id = contadorId++; // id automático
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = 50000; // salario por defecto
        totalEmpleados++;
    }

    // Método sobrecargado: actualizar salario por porcentaje
    public void actualizarSalario(double porcentaje) {
        this.salario += this.salario * (porcentaje / 100);
    }

    // Método sobrecargado: actualizar salario por monto fijo
    public void actualizarSalario(int montoFijo) {
        this.salario += montoFijo;
    }

    // Método toString
    @Override
    public String toString() {
        return "Empleado [ID=" + id +
               ", Nombre=" + nombre +
               ", Puesto=" + puesto +
               ", Salario=$" + salario + "]";
    }

    // Método estático: mostrar total de empleados
    public static int mostrarTotalEmpleados() {
        return totalEmpleados;
    }
}


