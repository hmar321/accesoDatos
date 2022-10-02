package main.entregahector.ejercicio4;

public class Punto {
    /* atributos */
    protected int iCordX;
    protected int iCordY;

    /* constructor */
    public Punto(int iCordX, int iCordY) {
        this.iCordX = iCordX;
        this.iCordY = iCordY;
    }

    /* metodos */
    public double distancia(Punto otroPunto) {
        double ejeX=(otroPunto.iCordX-this.iCordX)*(otroPunto.iCordX-this.iCordX);
        double ejeY=(otroPunto.iCordY-this.iCordY)*(otroPunto.iCordY-this.iCordY);
        return Math.sqrt(ejeX+ejeY);
    }

    public boolean equals(Punto otroPunto){
        return (this.iCordX==otroPunto.iCordX&this.iCordY==otroPunto.iCordY)?true:false;
    }

}
