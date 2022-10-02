package main.entregahector.ejercicio3;

import java.time.LocalDateTime;

public class Vehiculo {
    /* atributos */
    private String sMatricula;
    private LocalDateTime dFechaIni;
    private LocalDateTime dFechaFin;

    /* constructor */
    public Vehiculo(String sMatricula) {
        this.sMatricula = sMatricula;
    }

    /* metodos */
    public String getsMatricula() {
        return sMatricula;
    }

    public void setsMatricula(String sMatricula) {
        this.sMatricula = sMatricula;
    }

    public LocalDateTime getdFechaIni() {
        return dFechaIni;
    }

    public void setdFechaIni(LocalDateTime dFechaIni) {
        this.dFechaIni = dFechaIni;
    }

    public LocalDateTime getdFechaFin() {
        return dFechaFin;
    }

    public void setdFechaFin(LocalDateTime dFechaFin) {
        this.dFechaFin = dFechaFin;
    }

    @Override
    public String toString() {
        return "Vehiculo [Matrícula=" + sMatricula + ", FechaInicio=" + dFechaIni + ", FechaFin=" + dFechaFin + "]";
    }

}
