/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Usuario
 */

    public class Ej4 {

    // Clase Gallina
    static class Gallina {
        int idGallina;
        int edad;
        int huevosPuestos;

        // Constructor
        public Gallina(int idGallina, int edad) {
            this.idGallina = idGallina;
            this.edad = edad;
            this.huevosPuestos = 0;
        }

        // Método para poner un huevo
        public void ponerHuevo() {
            huevosPuestos++;
        }

        // Método para envejecer
        public void envejecer() {
            edad++;
        }

        // Método para mostrar el estado
        public void mostrarEstado() {
            System.out.println("Gallina ID: " + idGallina);
            System.out.println("Edad: " + edad);
            System.out.println("Huevos puestos: " + huevosPuestos);
            System.out.println("-----------------------");
        }
    }

    public static void main(String[] args) {
        // Crear dos gallinas
        Gallina g1 = new Gallina(1, 2);
        Gallina g2 = new Gallina(2, 3);

        // Simular acciones
        g1.ponerHuevo();
        g1.ponerHuevo();
        g1.envejecer();

        g2.ponerHuevo();
        g2.envejecer();
        g2.envejecer();

        // Mostrar estado final
        System.out.println("Estado de las gallinas:");
        g1.mostrarEstado();
        g2.mostrarEstado();
    }
}

}
