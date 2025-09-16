/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Usuario
 */
public class Ej13 {
    public static void main(String[] args) {
        Usuario13 usuario = new Usuario13("Laura Gómez", "laura@example.com");
        GeneradorQR generador = new GeneradorQR();
        CodigoQR codigo = generador.generar("ABC123XYZ", usuario);

        System.out.println("Código QR: " + codigo.getValor() +
                           " - Usuario: " + codigo.getUsuario().getNombre());
    }
}

class Usuario13 {
    private String nombre;
    private String email;

    public Usuario13(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }
}

class CodigoQR {
    private String valor;
    private Usuario13 usuario;

    public CodigoQR(String valor, Usuario13 usuario) {
        this.valor = valor;
        this.usuario = usuario;
    }

    public String getValor() {
        return valor;
    }

    public Usuario13 getUsuario() {
        return usuario;
    }
}

class GeneradorQR {
    public CodigoQR generar(String valor, Usuario13 usuario) {
        return new CodigoQR(valor, usuario);
    }
}

