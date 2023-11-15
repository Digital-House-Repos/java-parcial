package Paciente;

import java.util.Date;

import Consulta.Consulta;

abstract class Paciente {
    protected String nombre;
    protected String apellido;
    protected Date nacimiento;
    protected Consulta consulta; // lista?
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

    // Methods
    public void evaluacionInicial() {
        if (!this.primeraConsulta) {
            System.out.println("Evaluando...");
        } else {
            System.out.println("Ya se realizó la evaluación inicial.");
        }
    }

    public void asistirAConsulta() {
        if (!this.primeraConsulta) {
            this.primeraConsulta = true;
        }
        System.out.println("Asistiendo a consulta...");
    }
}
