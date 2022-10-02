package main.entregahector.ejercicio3;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

public class ParkingVehiculo implements Parking {
    /* constantes */
    private static final double PRECIO_MIN = 0.0425;
    private static final int PLAZAS = 100;
    /* atributos */
    private int iPlazasOcupadas;
    private String sDireccionParking;
    private ArrayList<Vehiculo> alListaVehiculos = new ArrayList<Vehiculo>();;

    /* constructor */
    public ParkingVehiculo(String sDireccionParking) {
        this.iPlazasOcupadas = 0;
        this.sDireccionParking = sDireccionParking;
    }

    /* metodos */
    @Override
    public boolean hayPlaza() {
        return (PLAZAS > iPlazasOcupadas) ? true : false;
    }

    @Override
    public void aparcaCoche(Vehiculo paramVehiculo) throws Exception {
        if (!hayPlaza()) {
            throw new Exception("Todas las plazas están ocupadas.");
        }
        if (alListaVehiculos.contains(paramVehiculo)) {
            throw new Exception("Este vehículo ya se encuentra en el parking.");
        }
        // asignamos fecha ini al vehiculo
        paramVehiculo.setdFechaIni(LocalDateTime.now());
        // guardamos el vehiculo
        alListaVehiculos.add(paramVehiculo);
        // ocupamos 1 plaza
        this.iPlazasOcupadas++;
    }

    @Override
    public void sacaCoche(Vehiculo paramVehiculo) throws Exception {
        if (!alListaVehiculos.contains(paramVehiculo)) {
            throw new Exception("Este vehículo no se encuentra en el parking.");
        }
        // asignamos fecha fin al vehiculo
        paramVehiculo.setdFechaFin(LocalDateTime.now());
        // quitamos el vehiculo
        alListaVehiculos.remove(paramVehiculo);
        // desocupamos 1 plaza
        this.iPlazasOcupadas--;
    }

    @Override
    public double getFactura(Vehiculo paramVehiculo) {
        return (paramVehiculo.getdFechaIni().until(paramVehiculo.getdFechaFin(), ChronoUnit.MINUTES)) * PRECIO_MIN;

    }

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

}
