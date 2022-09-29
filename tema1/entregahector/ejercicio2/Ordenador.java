package main.entregahector.ejercicio2;
/*
los de sobremesa la descripción del tipo de torre.

Crear un programa en Java (OrdenadorTestMiNombre) que cree un par de
objetos de tipo Ordenador y Portátil y realice operaciones con ellos.

Incluye una imagen llamada OrdenadorTestPrueba */
public class Ordenador {
    /*constantes */
    /*atributo */
    private String sCodigo;
    private int iRam;
    private String sCpu;
    private double dPrecio;
    /*constructor */
    public Ordenador(String sCodigo, int iRam, String sCpu, double dPrecio) {
        this.sCodigo = sCodigo;
        this.iRam = iRam;
        this.sCpu = sCpu;
        this.dPrecio = dPrecio;
    }
    /*metodos */
    public String getsCodigo() {
        return sCodigo;
    }

    public int getiRam() {
        return iRam;
    }

    public String getsCpu() {
        return sCpu;
    }

    public double getdPrecio() {
        return dPrecio;
    }

    @Override
    public String toString() {
        return "Ordenador [Código=" + sCodigo + ", RAM=" + iRam + ", CPU=" + sCpu + ", Precio=" + dPrecio + "]";
    }
}
