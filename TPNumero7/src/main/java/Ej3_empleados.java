/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Usuario
 */
import java.util.ArrayList;

abstract class Empleado {
    protected String nombre;

    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    public abstract double calcularSueldo();

    public String getNombre() {
        return nombre;
    }
}

class EmpleadoPlanta extends Empleado {
    private double salarioMensual;

    public EmpleadoPlanta(String nombre, double salarioMensual) {
        super(nombre);
        this.salarioMensual = salarioMensual;
    }

    @Override
    public double calcularSueldo() {
        return salarioMensual;
    }
}

class EmpleadoTemporal extends Empleado {
    private double pagoPorHora;
    private int horasTrabajadas;

    public EmpleadoTemporal(String nombre, double pagoPorHora, int horasTrabajadas) {
        super(nombre);
        this.pagoPorHora = pagoPorHora;
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    public double calcularSueldo() {
        return pagoPorHora * horasTrabajadas;
    }
}

public class Ej3_empleados {
    public static void main(String[] args) {
        ArrayList<Empleado> empleados = new ArrayList<>();
        empleados.add(new EmpleadoPlanta("Ana", 50000));
        empleados.add(new EmpleadoTemporal("Juan", 200, 120));
        empleados.add(new EmpleadoPlanta("Luis", 60000));
        empleados.add(new EmpleadoTemporal("Marta", 250, 100));

        for (Empleado e : empleados) {
            System.out.println(e.getNombre() + " tiene un sueldo de: " + e.calcularSueldo());

            if (e instanceof EmpleadoPlanta) {
                System.out.println("Tipo: Empleado de planta");
            } else if (e instanceof EmpleadoTemporal) {
                System.out.println("Tipo: Empleado temporal");
            }

            System.out.println("-------------------------");
        }
    }
}

