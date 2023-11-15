package Paciente;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;

import Consulta.Consulta;

abstract class Paciente {
    protected String nombre;
    protected String apellido;
    protected Date nacimiento;
    protected List<Consulta> consulta = new ArrayList<>();
    protected Boolean primeraConsulta;

    // Constructor
    public Paciente(String nombre, String apellido, Date nacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacimiento = nacimiento;
        this.primeraConsulta = false;
    }

    // Getters & Setter

    // ToString
    @Override
    public String toString() {
        return "Paciente" + this.nombre + " " + this.apellido;
    }

    // Methods
    public void evaluacionInicial() {
        if (!this.primeraConsulta) {
            System.out.println("Evaluando...");
        } else {
            System.out.println("Ya se realizó la evaluación inicial.");
        }
    }

    public void solicitarConsulta(Date fecha, String especialidad, int hora, int minuto) {
        if (!this.primeraConsulta) {
            this.primeraConsulta = true;
        }

        Consulta nuevaConsulta = new Consulta(fecha, especialidad, hora, minuto);
        this.consulta.add(nuevaConsulta);

        System.out.println("Consulta solicitada con éxito.");
    }

    public void listarConsultas() {
        System.out.println("Lista de consultas del paciente " + nombre + " " + apellido + ":");
        for (Consulta consulta : consulta) {
            System.out.println(consulta);
        }
    }
}
