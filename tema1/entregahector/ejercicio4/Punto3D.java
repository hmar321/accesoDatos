package main.entregahector.ejercicio4;

public class Punto3D extends Punto{
    /* atributos */
    private int iCordZ;

    /* constructor */
    public Punto3D(int iCordX, int iCordY, int iCordZ) {
        super(iCordX, iCordY);
        this.iCordZ = iCordZ;
    }
    /*metodos */
    public double distancia(Punto3D otroPunto3d) {
        double ejeZ=Math.sqrt((otroPunto3d.iCordZ-this.iCordZ)*(otroPunto3d.iCordZ-this.iCordZ));
        return super.distancia(otroPunto3d)+ejeZ;
    }

    public boolean equals(Punto3D otroPunto3d){
        return (super.equals(otroPunto3d)&this.iCordZ==otroPunto3d.iCordZ)?true:false;
    }

}
