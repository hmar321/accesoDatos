package main.entregahector.ejercicio3;
/*hayPlaza() que indique si hay sitio para aparcar
 aparcaCoche() que estaciona un vehículo en el parking. Se pasa por
parámetro el coche.
 sacaCoche() que saca un vehículo del parking. Se pasa por parámetro el
coche.
 getFactura() que devuelve el importe a pagar por cada vehículo. Se pasa
por parámetro el coche. 
 */
interface Parking {
    /*metodos */
    public void hayPlaza();
    public void aparcaCoche();
    public void sacaCoche();
    public void getFactura();


}
