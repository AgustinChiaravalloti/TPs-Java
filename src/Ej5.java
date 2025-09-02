/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Usuario
 */

    public class Ej5 {

    // Clase NaveEspacial
    static class NaveEspacial {
        String nombre;
        double combustible;
        final double MAX_COMBUSTIBLE = 100; // límite de combustible

        // Constructor
        public NaveEspacial(String nombre, double combustibleInicial) {
            this.nombre = nombre;
            this.combustible = combustibleInicial;
        }

        // Método para despegar
        public void despegar() {
            if (combustible >= 10) {
                combustible -= 10;
                System.out.println(nombre + " ha despegado. Combustible restante: " + combustible);
            } else {
                System.out.println(nombre + " no tiene suficiente combustible para despegar.");
            }
        }

        // Método para avanzar una distancia (1 unidad de distancia = 5 combustible)
        public void avanzar(double distancia) {
            double consumo = distancia * 5;
            if (combustible >= consumo) {
                combustible -= consumo;
                System.out.println(nombre + " avanzó " + distancia + " unidades. Combustible restante: " + combustible);
            } else {
                System.out.println(nombre + " no tiene suficiente combustible para avanzar " + distancia + " unidades.");
            }
        }

        // Método para recargar combustible
        public void recargarCombustible(double cantidad) {
            if (combustible + cantidad > MAX_COMBUSTIBLE) {
                combustible = MAX_COMBUSTIBLE;
                System.out.println(nombre + " recargó hasta el máximo: " + MAX_COMBUSTIBLE);
            } else {
                combustible += cantidad;
                System.out.println(nombre + " recargó " + cantidad + " unidades. Combustible actual: " + combustible);
            }
        }

        // Método para mostrar estado
        public void mostrarEstado() {
            System.out.println("Nave: " + nombre);
            System.out.println("Combustible: " + combustible);
            System.out.println("-----------------------");
        }
    }

    public static void main(String[] args) {
        // Crear nave con 50 unidades de combustible
        NaveEspacial nave = new NaveEspacial("Enterprise", 50);

        System.out.println("Estado inicial de la nave:");
        nave.mostrarEstado();

        // Intentar avanzar sin recargar suficiente
        nave.avanzar(15); // debería dar error por combustible insuficiente

        // Recargar combustible
        nave.recargarCombustible(50);

        // Avanzar correctamente
        nave.avanzar(15); // ahora puede avanzar

        // Mostrar estado final
        System.out.println("\nEstado final de la nave:");
        nave.mostrarEstado();
    }
}

