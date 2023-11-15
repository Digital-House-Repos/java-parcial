package Paciente;

import java.util.Date;

public class PacienteObraSocial extends Paciente {
    private String nombreObraSocial;
    private int numeroAsociado;
    private static int cantidadPacientesObraSocial = 1;

    // Constructor
    public PacienteObraSocial(String nombre, String apellido, Date nacimiento, String nombreObraSocial) {
        super(nombre, apellido, nacimiento);
        this.nombreObraSocial = nombreObraSocial;
        this.numeroAsociado = cantidadPacientesObraSocial;
        PacienteObraSocial.cantidadPacientesObraSocial++;
    }

    // Methods
    public Boolean compararPaciente(PacienteObraSocial paciente) {
        return this.numeroAsociado > paciente.numeroAsociado;
    }

    // ToString
    @Override
    public String toString() {
        return "Obra Social - " + this.numeroAsociado + " - " + this.nombre + " " + this.apellido + " - " + this.nombreObraSocial;
    }
}
