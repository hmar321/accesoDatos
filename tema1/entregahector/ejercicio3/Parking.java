package main.entregahector.ejercicio3;

interface Parking {
    /* metodos */
    public boolean hayPlaza();

    public void aparcaCoche(Vehiculo paramVehiculo) throws Exception;

    public void sacaCoche(Vehiculo paramVehiculo) throws Exception;

    public double getFactura(Vehiculo paramVehiculo);

}
