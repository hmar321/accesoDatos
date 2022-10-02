package main.entregahector.ejercicio2;

public class Portatil extends Ordenador{
    /*atributo */
    private double dPeso;
    /*constructor */
    public Portatil(String sCodigo, int iRam, String sCpu, double dPrecio, double dPeso) {
        super(sCodigo, iRam, sCpu, dPrecio);
        this.dPeso = dPeso;
    }
    /*metodos */
    public double getdPeso() {
        return dPeso;
    }
    @Override
    public String toString() {
        return super.toString()+"Portátil [Peso=" + dPeso + "]";
    }
    
}
