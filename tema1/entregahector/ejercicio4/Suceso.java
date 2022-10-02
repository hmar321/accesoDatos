package main.entregahector.ejercicio4;

import java.time.LocalDateTime;

public class Suceso extends Punto3D{
    /*atributos */
    private LocalDateTime dtTiempo;
    private String sDescripcion;
    /*constructor */
    public Suceso(int iCordX, int iCordY, int iCordZ, LocalDateTime dtTiempo, String sDescripcion) {
        super(iCordX, iCordY, iCordZ);
        this.dtTiempo = dtTiempo;
        this.sDescripcion = sDescripcion;
    }

    /*metodos */
    public boolean equals(Suceso otroSuceso) {
        return (super.equals(otroSuceso)&this.dtTiempo==otroSuceso.dtTiempo)?true:false;
    }
    
    
}
