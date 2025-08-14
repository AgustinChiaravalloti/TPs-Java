
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Usuario
 */
public class TPNumero2_Ej9 {
     public static double calcularCostoEnvio(double peso, String zona) {
        if (zona.equalsIgnoreCase("Nacional")) {
            return peso * 5;
        } else if (zona.equalsIgnoreCase("Internacional")) {
            return peso * 10;
        } else {
            return -1;
        }
    }
    
    public static double calcularTotalCompra(double precioProducto, double costoEnvio) {
        return precioProducto + costoEnvio;
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese el precio del producto: ");
        double precioProducto = sc.nextDouble();
        
        System.out.print("Ingrese el peso del paquete en kg: ");
        double peso = sc.nextDouble();
        
        System.out.print("Ingrese la zona de envío (Nacional/Internacional): ");
        String zona = sc.next();
        
        double costoEnvio = calcularCostoEnvio(peso, zona);
        
        if (costoEnvio == -1) {
            System.out.println("Zona inválida.");
        } else {
            double total = calcularTotalCompra(precioProducto, costoEnvio);
            System.out.println("El costo de envío es: " + costoEnvio);
            System.out.println("El total a pagar es: " + total);
        }
        
        sc.close();
    }
}
