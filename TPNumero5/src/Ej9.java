/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Usuario
 */
class Paciente {
    String nombre;
    String obraSocial;

    public Paciente(String nombre, String obraSocial) {
        this.nombre = nombre;
        this.obraSocial = obraSocial;
    }
}

class Profesional {
    String nombre;
    String especialidad;

    public Profesional(String nombre, String especialidad) {
        this.nombre = nombre;
        this.especialidad = especialidad;
    }
}

class CitaMedica {
    String fecha;
    String hora;
    Paciente paciente;
    Profesional profesional;

    public CitaMedica(String fecha, String hora, Paciente paciente, Profesional profesional) {
        this.fecha = fecha;
        this.hora = hora;
        this.paciente = paciente;
        this.profesional = profesional;
    }
}

public class Ej9 {
    public static void main(String[] args) {
        Paciente paciente = new Paciente("Juan Pérez", "OSDE");
        Profesional profesional = new Profesional("Dra. Martínez", "Cardiología");
        CitaMedica cita = new CitaMedica("2025-09-20", "15:30", paciente, profesional);

        System.out.println("Cita médica: " + cita.fecha + " a las " + cita.hora);
        System.out.println("Paciente: " + cita.paciente.nombre + " - Obra social: " + cita.paciente.obraSocial);
        System.out.println("Profesional: " + cita.profesional.nombre + " - Especialidad: " + cita.profesional.especialidad);
    }
}
