
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Usuario
 */
public class TPNumero2_Ej4 {
     public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese el precio del producto: ");
        double precioOriginal = sc.nextDouble();
        
        System.out.print("Ingrese la categoría del producto (A, B o C): ");
        String categoria = sc.next().toUpperCase(); // Convertimos a mayúscula para evitar errores
        
        double descuento = 0;
        
        // Estructura condicional para asignar el descuento
        if (categoria.equals("A")) {
            descuento = 0.10;
        } else if (categoria.equals("B")) {
            descuento = 0.15;
        } else if (categoria.equals("C")) {
            descuento = 0.20;
        } else {
            System.out.println("Categoría inválida.");
            sc.close();
            return; // Termina el programa si la categoría no es válida
        }
        
        // Cálculo del precio final
        double montoDescuento = precioOriginal * descuento;
        double precioFinal = precioOriginal - montoDescuento;
        
        // Salida de resultados
        System.out.println("Precio original: $" + precioOriginal);
        System.out.println("Descuento aplicado: " + (int)(descuento * 100) + "%");
        System.out.println("Precio final: $" + precioFinal);
        
        sc.close();
    }
}

