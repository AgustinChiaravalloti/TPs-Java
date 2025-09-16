/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Usuario
 */
class Reserva {
    private String fecha;
    private String hora;
    private Cliente2 cliente;
    private Mesa mesa;

    public Reserva(String fecha, String hora, Cliente2 cliente, Mesa mesa) {
        this.fecha = fecha;
        this.hora = hora;
        this.cliente = cliente;
        this.mesa = mesa;
    }

    public String getFecha() { return fecha; }
    public String getHora() { return hora; }
    public Cliente2 getCliente() { return cliente; }
    public Mesa getMesa() { return mesa; }
}

class Cliente2 {
    private String nombre;
    private String telefono;

    public Cliente2(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public String getNombre() { return nombre; }
    public String getTelefono() { return telefono; }
}

class Mesa {
    private int numero;
    private int capacidad;

    public Mesa(int numero, int capacidad) {
        this.numero = numero;
        this.capacidad = capacidad;
    }

    public int getNumero() { return numero; }
    public int getCapacidad() { return capacidad; }
}

public class Ej6 {
    public static void main(String[] args) {
        Cliente2 cliente = new Cliente2("Ana", "123456789");
        Mesa mesa = new Mesa(5, 4);
        Reserva reserva = new Reserva("2025-09-14", "21:00", cliente, mesa);

        System.out.println("Reserva realizada:");
        System.out.println("Cliente: " + cliente.getNombre() + " - Tel: " + cliente.getTelefono());
        System.out.println("Mesa Nº: " + mesa.getNumero() + " (Capacidad: " + mesa.getCapacidad() + ")");
        System.out.println("Fecha: " + reserva.getFecha() + " - Hora: " + reserva.getHora());
    }
}
