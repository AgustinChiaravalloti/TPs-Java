/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Usuario
 */
class Usuario2 {
    String nombre;
    String email;

    public Usuario2(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }
}

class FirmaDigital {
    String codigoHash;
    String fecha;
    Usuario2 usuario;

    public FirmaDigital(String codigoHash, String fecha, Usuario2 usuario) {
        this.codigoHash = codigoHash;
        this.fecha = fecha;
        this.usuario = usuario;
    }
}

class Documento {
    String titulo;
    String contenido;
    FirmaDigital firmaDigital;

    public Documento(String titulo, String contenido, FirmaDigital firmaDigital) {
        this.titulo = titulo;
        this.contenido = contenido;
        this.firmaDigital = firmaDigital;
    }
}

public class Ej8 {
    public static void main(String[] args) {
        Usuario2 usuario = new Usuario2("Laura Gómez", "laura@example.com");
        FirmaDigital firma = new FirmaDigital("ABC123XYZ", "2025-09-15", usuario);
        Documento doc = new Documento("Contrato", "Contenido del contrato...", firma);

        System.out.println("Documento: " + doc.titulo);
        System.out.println("Firma: " + doc.firmaDigital.codigoHash + " - Fecha: " + doc.firmaDigital.fecha);
        System.out.println("Usuario: " + doc.firmaDigital.usuario.nombre + " - Email: " + doc.firmaDigital.usuario.email);
    }
}
