/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Usuario
 */

   class TarjetaDeCredito {
    String numero;
    String fechaVencimiento;
    Cliente cliente;
    Banco banco;

    public TarjetaDeCredito(String numero, String fechaVencimiento, Cliente cliente, Banco banco) {
        this.numero = numero;
        this.fechaVencimiento = fechaVencimiento;
        this.cliente = cliente;
        this.banco = banco;
    }
}

class Cliente {
    String nombre;
    String dni;

    public Cliente(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }
}

class Banco {
    String nombre;
    String cuit;

    public Banco(String nombre, String cuit) {
        this.nombre = nombre;
        this.cuit = cuit;
    }
}

public class Ej4 {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Juan Pérez", "12345678");
        Banco banco = new Banco("Banco Nación", "30-12345678-9");
        TarjetaDeCredito tarjeta = new TarjetaDeCredito("1234-5678-9876-5432", "12/28", cliente, banco);

        System.out.println("Cliente: " + cliente.nombre + " - DNI: " + cliente.dni);
        System.out.println("Tarjeta: " + tarjeta.numero + " - Vence: " + tarjeta.fechaVencimiento);
        System.out.println("Banco: " + banco.nombre + " - CUIT: " + banco.cuit);
    }
}
 

