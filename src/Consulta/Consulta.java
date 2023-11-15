package Consulta;

import java.util.Date;

public class Consulta {
    private Date fecha;
    private String especialidad;
    private int hora;
    private int minuto;

    // Constructor
    public Consulta(Date fecha, String especialidad, int hora, int minuto) {
        this.fecha = fecha;
        this.especialidad = especialidad;
        this.hora = hora;
        this.minuto = minuto;
    }

    // ToString
    @Override
    public String toString() {
        return "Fecha: " + fecha + '\n' +
                "Especialidad: " + especialidad + '\n' +
                "Hora: " + hora + ":" + minuto + '\n';
    }
}
