package main.entregahector.ejercicio1;

import java.text.DecimalFormat;

public class Complejo {

    /* atributos */
    private double dPReal;
    private double dPImag;

    /* constructor */
    public Complejo() {

    }
    /* metodos */

    public double getdPReal() {
        return dPReal;
    }

    public void setdPReal(double dPReal) {
        this.dPReal = dPReal;
    }

    public double getdPImag() {
        return dPImag;
    }

    public void setdPImag(double dPImag) {
        this.dPImag = dPImag;
    }

    public void Asignar(double paramReal, double paramImag) {
        this.dPImag = paramImag;
        this.dPReal = paramReal;
    }

    public void sumaComplejo(Complejo paramC1, Complejo paramC2) {
        this.Asignar(paramC1.dPReal + paramC2.dPReal, paramC1.dPImag + paramC2.dPImag);
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#.00");
        return "Complejo [Imaginario=" + df.format(dPImag) + ", Real=" + df.format(dPReal) + "]";
    }

}
