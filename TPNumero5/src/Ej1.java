/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Usuario
 */
public class Ej1 {
    
    public static void main(String[] args) {
        
        Foto foto = new Foto("foto.jpg", "jpg");

        
        Titular titular = new Titular("Juan Pérez", "12345678");

        
        Pasaporte pasaporte = new Pasaporte("A1234567", "01/01/2025", foto, titular);

       
        System.out.println("Pasaporte N°: " + pasaporte.numero);
        System.out.println("Fecha de emisión: " + pasaporte.fechaEmision);
        System.out.println("Foto: " + pasaporte.foto.imagen + " (" + pasaporte.foto.formato + ")");
        System.out.println("Titular: " + pasaporte.titular.nombre + " - DNI: " + pasaporte.titular.dni);
    }
}


class Foto {
    String imagen;
    String formato;

    public Foto(String imagen, String formato) {
        this.imagen = imagen;
        this.formato = formato;
    }
}


class Titular {
    String nombre;
    String dni;
    Pasaporte pasaporte;

    public Titular(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }
}


class Pasaporte {
    String numero;
    String fechaEmision;
    Foto foto;
    Titular titular;

    public Pasaporte(String numero, String fechaEmision, Foto foto, Titular titular) {
        this.numero = numero;
        this.fechaEmision = fechaEmision;
        this.foto = foto;
        this.titular = titular;

        if(titular != null){
            titular.pasaporte = this;
        }
    }
}


