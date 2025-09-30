/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Usuario
 */
package tienda;

import java.util.ArrayList;

public class Inventario {
    ArrayList<Producto> productos = new ArrayList<>();

    public void agregarProducto(Producto p) {
        productos.add(p);
    }

    public void listarProductos() {
        for (Producto p : productos) p.mostrarInfo();
    }

    public Producto buscarProductoPorId(String id) {
        for (Producto p : productos)
            if (p.id.equals(id)) return p;
        return null;
    }

    public void eliminarProducto(String id) {
        productos.removeIf(p -> p.id.equals(id));
    }

    public void actualizarStock(String id, int nuevaCantidad) {
        Producto p = buscarProductoPorId(id);
        if (p != null) p.cantidad = nuevaCantidad;
    }

    public void filtrarPorCategoria(CategoriaProducto cat) {
        for (Producto p : productos)
            if (p.categoria == cat) p.mostrarInfo();
    }
}

