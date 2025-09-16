/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Usuario
 */
class ClaveSeguridad {
    String codigo;
    String ultimaModificacion;

    public ClaveSeguridad(String codigo, String ultimaModificacion) {
        this.codigo = codigo;
        this.ultimaModificacion = ultimaModificacion;
    }
}

class Titular {
    String nombre;
    String dni;
    CuentaBancaria cuenta;  

    public Titular(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }
}

class CuentaBancaria {
    String cbu;
    double saldo;
    ClaveSeguridad claveSeguridad;
    Titular titular;

    public CuentaBancaria(String cbu, double saldo, ClaveSeguridad claveSeguridad, Titular titular) {
        this.cbu = cbu;
        this.saldo = saldo;
        this.claveSeguridad = claveSeguridad;
        this.titular = titular;

        if (titular != null) {
            titular.cuenta = this;
        }
    }
}

public class Ej10 {
    public static void main(String[] args) {
        Titular titular = new Titular("María López", "30111222");
        ClaveSeguridad clave = new ClaveSeguridad("XYZ789", "2025-09-10");
        CuentaBancaria cuenta = new CuentaBancaria("1234567890001", 150000.50, clave, titular);

        System.out.println("Cuenta CBU: " + cuenta.cbu + " - Saldo: $" + cuenta.saldo);
        System.out.println("Clave: " + cuenta.claveSeguridad.codigo + " - Última modificación: " + cuenta.claveSeguridad.ultimaModificacion);
        System.out.println("Titular: " + cuenta.titular.nombre + " - DNI: " + cuenta.titular.dni);
    }
}
