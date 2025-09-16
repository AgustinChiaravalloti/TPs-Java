/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Usuario
 */
class Motor {
    String tipo;
    String numeroSerie;

    public Motor(String tipo, String numeroSerie) {
        this.tipo = tipo;
        this.numeroSerie = numeroSerie;
    }
}

class Conductor {
    String nombre;
    String licencia;
    Vehiculo vehiculo;

    public Conductor(String nombre, String licencia) {
        this.nombre = nombre;
        this.licencia = licencia;
    }
}

class Vehiculo {
    String patente;
    String modelo;
    Motor motor;
    Conductor conductor;

    public Vehiculo(String patente, String modelo, Motor motor, Conductor conductor) {
        this.patente = patente;
        this.modelo = modelo;
        this.motor = motor;
        this.conductor = conductor;

        if(conductor != null) {
            conductor.vehiculo = this;
        }
    }
}

public class Ej7 {
    public static void main(String[] args) {
        Motor motor = new Motor("V8", "SN987654");
        Conductor conductor = new Conductor("Carlos López", "LIC12345");
        Vehiculo vehiculo = new Vehiculo("ABC123", "Toyota Supra", motor, conductor);

        System.out.println("Vehículo: " + vehiculo.modelo + " - Patente: " + vehiculo.patente);
        System.out.println("Motor: " + vehiculo.motor.tipo + " - N° Serie: " + vehiculo.motor.numeroSerie);
        System.out.println("Conductor: " + vehiculo.conductor.nombre + " - Licencia: " + vehiculo.conductor.licencia);
    }
}
