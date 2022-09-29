package main.entregahector.ejercicio2;

public class Sobremesa extends Ordenador{
    /*atributos */
    private String sDesTorre;
    /*constructor */
    public Sobremesa(String sCodigo, int iRam, String sCpu, double dPrecio, String sDesTorre) {
        super(sCodigo, iRam, sCpu, dPrecio);
        this.sDesTorre = sDesTorre;
    }
    /*metodos */
    public String getsDesTorre() {
        return sDesTorre;
    }

    @Override
    public String toString() {
        return "Sobremesa [sDesTorre=" + sDesTorre + "] "+super.toString();
    }
    
}
