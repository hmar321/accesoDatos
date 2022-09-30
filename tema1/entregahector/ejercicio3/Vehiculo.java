package main.entregahector.ejercicio3;

import java.time.LocalTime;

/*Escribe una clase Vehiculo que tenga como atributos la matrícula y fecha inicio
y fecha fin del estacionamiento.
Constructor con la matrícula y los getters y setters de los 3 atributos y toString() 
 */
public class Vehiculo {
    /* atributos */
    private String sMatricula;
    private LocalTime dFechaIni;
    private LocalTime dFechaFin;

    /* constructor */
    public Vehiculo(String sMatricula, LocalTime dFechaIni, LocalTime dFechaFin) {
        this.sMatricula = sMatricula;
        this.dFechaIni = dFechaIni;
        this.dFechaFin = dFechaFin;
    }

    /* metodos */
    public String getsMatricula() {
        return sMatricula;
    }

    public void setsMatricula(String sMatricula) {
        this.sMatricula = sMatricula;
    }

    public LocalTime getdFechaIni() {
        return dFechaIni;
    }

    public void setdFechaIni(LocalTime dFechaIni) {
        this.dFechaIni = dFechaIni;
    }

    public LocalTime getdFechaFin() {
        return dFechaFin;
    }

    public void setdFechaFin(LocalTime dFechaFin) {
        this.dFechaFin = dFechaFin;
    }

}
