package main.entregahector.ejercicio3;
/*Crea el paquete parking para las clases de este ejercicio.
Escribe una interfaz Parking que incluya los métodos
 hayPlaza() que indique si hay sitio para aparcar
 aparcaCoche() que estaciona un vehículo en el parking. Se pasa por
parámetro el coche.
 sacaCoche() que saca un vehículo del parking. Se pasa por parámetro el
coche.
 getFactura() que devuelve el importe a pagar por cada vehículo. Se pasa
por parámetro el coche.
Escribe una clase ParkingVehiculo que implemente la interfaz Parking y tenga
como contante el precio por minuto de 0,0425 euros y el máximo de plazas a
100 y como atributos dirección del parking, plazas actuales ocupadas.
Tendrá un constructor con la dirección del parking e implementará los métodos
del interfaz.
Escribe una clase Vehiculo que tenga como atributos la matrícula y fecha inicio
y fecha fin del estacionamiento.
Constructor con la matrícula y los getters y setters de los 3 atributos y toString()
Escribe una clase ParkingTestMiNombre que cree 5 vehículos y un parking y
los aparque, saque del parking y calcule la factura.  */
interface Parking {
    /*metodos */
    public boolean hayPlaza();
    public void aparcaCoche(Vehiculo paramVehiculo);
    public void sacaCoche();
    public void getFactura();


}
