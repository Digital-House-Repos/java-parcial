package Paciente;

import java.util.Date;

public class PacienteParticular extends Paciente {
    private String DNI;
    private Double costoConsulta;

    // Constructor
    public PacienteParticular(String nombre, String apellido, Date nacimiento, String DNI, Double costoConsulta) {
        super(nombre, apellido, nacimiento);
        this.DNI = DNI;
        this.costoConsulta = costoConsulta;
    }
}
