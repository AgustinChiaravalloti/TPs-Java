/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Usuario
 */
package tienda;

public class Main {
    public static void main(String[] args) {
        Inventario inv = new Inventario();

        // Agregar productos
        inv.agregarProducto(new Producto("P001", "Arroz", 1200, 50, CategoriaProducto.ALIMENTOS));
        inv.agregarProducto(new Producto("P002", "Televisor", 2500, 10, CategoriaProducto.ELECTRONICA));
        inv.agregarProducto(new Producto("P003", "Remera", 800, 30, CategoriaProducto.ROPA));
        inv.agregarProducto(new Producto("P004", "Silla", 1500, 15, CategoriaProducto.HOGAR));
        inv.agregarProducto(new Producto("P005", "Laptop", 3000, 5, CategoriaProducto.ELECTRONICA));

        // Listar productos
        System.out.println("Listado de productos:");
        inv.listarProductos();

        // Buscar producto por ID
        System.out.println("\nBuscando producto P003:");
        Producto p = inv.buscarProductoPorId("P003");
        if (p != null) p.mostrarInfo();

        // Filtrar por categoría
        System.out.println("\nProductos ELECTRONICA:");
        inv.filtrarPorCategoria(CategoriaProducto.ELECTRONICA);

        // Eliminar producto
        System.out.println("\nEliminando P003...");
        inv.eliminarProducto("P003");
        inv.listarProductos();

        // Actualizar stock
        System.out.println("\nActualizando stock de P002...");
        inv.actualizarStock("P002", 20);
        inv.buscarProductoPorId("P002").mostrarInfo();
    }
}

