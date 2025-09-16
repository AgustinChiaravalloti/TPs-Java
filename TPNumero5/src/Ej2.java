/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Usuario
 */
public class Ej2 {
    
    public static void main(String[] args) {
        Bateria bateria = new Bateria("Li-Ion", 4000);
        Usuario usuario = new Usuario("Ana Gómez", "87654321");
        Celular celular = new Celular("123456789012345", "Samsung", "Galaxy S21", bateria, usuario);

        System.out.println("Celular IMEI: " + celular.imei);
        System.out.println("Marca/Modelo: " + celular.marca + " " + celular.modelo);
        System.out.println("Batería: " + celular.bateria.modelo + " " + celular.bateria.capacidad + "mAh");
        System.out.println("Usuario: " + celular.usuario.nombre + " - DNI: " + celular.usuario.dni);
    }
}

class Bateria {
    String modelo;
    int capacidad;

    public Bateria(String modelo, int capacidad) {
        this.modelo = modelo;
        this.capacidad = capacidad;
    }
}

class Usuario {
    String nombre;
    String dni;
    Celular celular;

    public Usuario(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }
}

class Celular {
    String imei;
    String marca;
    String modelo;
    Bateria bateria;
    Usuario usuario;

    public Celular(String imei, String marca, String modelo, Bateria bateria, Usuario usuario) {
        this.imei = imei;
        this.marca = marca;
        this.modelo = modelo;
        this.bateria = bateria;
        this.usuario = usuario;

        if(usuario != null){
            usuario.celular = this;
        }
    }
}


