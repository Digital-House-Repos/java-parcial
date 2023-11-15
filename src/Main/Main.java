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
        System.out.println("El paciente 1 es mayor que el paciente 2?");
        System.out.println(paciente1.compararPaciente(paciente2));
        System.out.println();

        // PAcientes Particulares
        System.out.println("Pacientes Particulares: ");
        PacienteParticular paciente4 = new PacienteParticular("Lucas", "Dalto", fechaActual, "111222333", 5890.0);
        System.out.println(paciente4);

        PacienteParticular paciente5 = new PacienteParticular("Steve", "Rogers", fechaActual, "12345678", 1000.0);
        System.out.println(paciente5);

    }
}
