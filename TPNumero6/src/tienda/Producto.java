/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Usuario
 */
package tienda;

public class Producto {
    String id;
    String nombre;
    double precio;
    int cantidad;
    CategoriaProducto categoria;

    public Producto(String id, String nombre, double precio, int cantidad, CategoriaProducto categoria) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.categoria = categoria;
    }

    public void mostrarInfo() {
        System.out.println(id + " | " + nombre + " | $" + precio + " | Stock: " + cantidad + " | " + categoria + " (" + categoria.getDescripcion() + ")");
    }
}

