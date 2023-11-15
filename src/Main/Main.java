package Main;

import Paciente.PacienteObraSocial;
import Paciente.PacienteParticular;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date fechaActual = new Date();


        // Pacientes Obra Social
        System.out.println("Pacientes Obra Social: ");
        PacienteObraSocial paciente1 = new PacienteObraSocial("Juan", "Perez", fechaActual, "OSDE");
        System.out.println(paciente1);

        PacienteObraSocial paciente2 = new PacienteObraSocial("Pedro", "Gomez", fechaActual, "OSDE");
        System.out.println(paciente2);

        PacienteObraSocial paciente3 = new PacienteObraSocial("Franco", "Tineo", fechaActual, "OSDE");
        System.out.println(paciente3);

        System.out.println();
        System.out.println("El paciente " + paciente1.getNumeroAsociado() + " es mayor que el paciente " + paciente2.getNumeroAsociado() + "?");
        System.out.println(paciente1.compararPaciente(paciente2));
        System.out.println();

        System.out.println("El paciente " + paciente3.getNumeroAsociado() + " es mayor que el paciente " + paciente2.getNumeroAsociado() + "?");
        System.out.println(paciente3.compararPaciente(paciente2));
        System.out.println();


        // Pacientes Particulares
        System.out.println("Pacientes Particulares: ");
        PacienteParticular paciente4 = new PacienteParticular("Lucas", "Dalto", fechaActual, "111222333", 5890.0);
        System.out.println(paciente4);

        PacienteParticular paciente5 = new PacienteParticular("Steve", "Rogers", fechaActual, "12345678", 1000.0);
        System.out.println(paciente5);


        // Consultas
        System.out.println();
        System.out.println("Consultas: ");
        paciente1.solicitarConsulta(fechaActual, "Cardiología", 10, 30);

        paciente1.solicitarConsulta(fechaActual, "Oftalmologia", 10, 30);

        System.out.println();
        paciente1.listarConsultas();
    }
}
