/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Usuario
 */
public class Ej14 {
    public static void main(String[] args) {
        Proyecto proyecto = new Proyecto("Video Promo", 5);
        EditorVideo editor = new EditorVideo();
        Render render = editor.exportar("MP4", proyecto);

        System.out.println("Render creado con formato: " + render.getFormato() +
                           " para el proyecto: " + render.getProyecto().getNombre());
    }
}

class Proyecto {
    private String nombre;
    private int duracionMin;

    public Proyecto(String nombre, int duracionMin) {
        this.nombre = nombre;
        this.duracionMin = duracionMin;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDuracionMin() {
        return duracionMin;
    }
}

class Render {
    private String formato;
    private Proyecto proyecto;

    public Render(String formato, Proyecto proyecto) {
        this.formato = formato;
        this.proyecto = proyecto;
    }

    public String getFormato() {
        return formato;
    }

    public Proyecto getProyecto() {
        return proyecto;
    }
}

class EditorVideo {
    public Render exportar(String formato, Proyecto proyecto) {
        return new Render(formato, proyecto);
    }
}
