package Main;

import Paciente.PacienteObraSocial;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        Date fechaActual = new Date();


        // Pacientes Obra Social
        PacienteObraSocial paciente1 = new PacienteObraSocial("Juan", "Perez", fechaActual, "OSDE");
        System.out.println(paciente1);
        System.out.println();

        PacienteObraSocial paciente2 = new PacienteObraSocial("Pedro", "Gomez", fechaActual, "OSDE");
        System.out.println(paciente2);
        System.out.println();

        PacienteObraSocial paciente3 = new PacienteObraSocial("Pedro", "Gomez", fechaActual, "OSDE");
        System.out.println(paciente3);
        System.out.println();
    }
}
