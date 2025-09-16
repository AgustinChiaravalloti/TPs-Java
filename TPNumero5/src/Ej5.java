/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Usuario
 */

    class PlacaMadre {
    String modelo;
    String chipset;

    public PlacaMadre(String modelo, String chipset) {
        this.modelo = modelo;
        this.chipset = chipset;
    }
}

class Propietario {
    String nombre;
    String dni;
    Computadora computadora;

    public Propietario(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }
}

class Computadora {
    String marca;
    String numeroSerie;
    PlacaMadre placa;
    Propietario propietario;

    public Computadora(String marca, String numeroSerie, PlacaMadre placa, Propietario propietario) {
        this.marca = marca;
        this.numeroSerie = numeroSerie;
        this.placa = placa;
        this.propietario = propietario;

        if(propietario != null) {
            propietario.computadora = this;
        }
    }
}

public class Ej5 {
    public static void main(String[] args) {
        PlacaMadre placa = new PlacaMadre("ASUS ROG", "Z690");
        Propietario propietario = new Propietario("Laura Martínez", "23456789");
        Computadora computadora = new Computadora("Dell", "SN123456", placa, propietario);

        System.out.println("Computadora: " + computadora.marca + " - N° Serie: " + computadora.numeroSerie);
        System.out.println("Placa Madre: " + computadora.placa.modelo + " - Chipset: " + computadora.placa.chipset);
        System.out.println("Propietario: " + computadora.propietario.nombre + " - DNI: " + computadora.propietario.dni);
    }
}

