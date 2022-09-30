package main.entregahector.ejercicio3;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class ParkingVehiculo implements Parking {
    /* constantes */
    private static final double PRECIO_MIN = 0.0425;
    private static final int PLAZAS = 100;
    /* atributos */
    private int iPlazasOcupadas;
    private String sDireccionParking;

    /* constructor */
    public ParkingVehiculo(int iPlazasOcupadas, String sDireccionParking) {
        this.iPlazasOcupadas = iPlazasOcupadas;
        this.sDireccionParking = sDireccionParking;
    }

    /* metodos */
    public int getiPlazasOcupadas() {
        return iPlazasOcupadas;
    }

    public void setiPlazasOcupadas(int iPlazasOcupadas) {
        this.iPlazasOcupadas = iPlazasOcupadas;
    }

    public String getsDireccionParking() {
        return sDireccionParking;
    }

    public void setsDireccionParking(String sDireccionParking) {
        this.sDireccionParking = sDireccionParking;
    }

    @Override
    public boolean hayPlaza() {
        return (PLAZAS > iPlazasOcupadas) ? true : false;
    }

    @Override
    public void aparcaCoche(Vehiculo paramVehiculo) {
        //ocupamos 1 plaza
        this.iPlazasOcupadas+=1;
        //asignamos fecha ini y fecha fin a vehiculo
        paramVehiculo.setdFechaIni(LocalTime.now());
        paramVehiculo.setdFechaFin(LocalTime.now().plus(2,ChronoUnit.HOURS));
    }

    @Override
    public void sacaCoche() {

    }

    @Override
    public void getFactura() {

    }

}
