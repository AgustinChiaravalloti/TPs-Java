/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package universidadApp;

/**
 *
 * @author Usuario
 */
public class AppUniversidad {
    public static void main(String[] args) {

        Universidad uni = new Universidad("Universidad Nacional");

        // Crear profesores
        Profesor prof1 = new Profesor("P1", "Laura Gómez", "Matemática");
        Profesor prof2 = new Profesor("P2", "Carlos Pérez", "Programación");
        Profesor prof3 = new Profesor("P3", "María Torres", "Historia");

        // Crear cursos
        Curso c1 = new Curso("C101", "Álgebra");
        Curso c2 = new Curso("C102", "Análisis Matemático");
        Curso c3 = new Curso("C201", "Programación I");
        Curso c4 = new Curso("C202", "Programación II");
        Curso c5 = new Curso("C301", "Historia Universal");

        // Agregar a la universidad
        uni.agregarProfesor(prof1);
        uni.agregarProfesor(prof2);
        uni.agregarProfesor(prof3);

        uni.agregarCurso(c1);
        uni.agregarCurso(c2);
        uni.agregarCurso(c3);
        uni.agregarCurso(c4);
        uni.agregarCurso(c5);

        // Asignar profesores a cursos
        uni.asignarProfesorACurso("C101", "P1");
        uni.asignarProfesorACurso("C102", "P1");
        uni.asignarProfesorACurso("C201", "P2");
        uni.asignarProfesorACurso("C202", "P2");
        uni.asignarProfesorACurso("C301", "P3");

        // Listar cursos y profesores
        uni.listarCursos();
        uni.listarProfesores();

        // Cambiar profesor de un curso
        System.out.println("\n🔄 Cambiando profesor de 'Programación II'...");
        uni.asignarProfesorACurso("C202", "P1");

        // Verificar sincronización
        uni.listarCursos();
        uni.listarProfesores();

        // Eliminar un curso
        System.out.println("\n🗑️ Eliminando curso 'C102'...");
        uni.eliminarCurso("C102");
        uni.listarProfesores();

        // Eliminar un profesor
        System.out.println("\n🗑️ Eliminando profesor 'P3'...");
        uni.eliminarProfesor("P3");
        uni.listarCursos();

        // Reporte final
        uni.reporteCursosPorProfesor();
    }
}
