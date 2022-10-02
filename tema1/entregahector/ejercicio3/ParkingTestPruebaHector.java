package main.entregahector.ejercicio3;

public class ParkingTestPruebaHector {
    public static void main(String[] args) throws Exception {
        System.out.println("Inicio ParkingTestHector");

        try {

            Vehiculo coche1 = new Vehiculo("1234LZP");
            Vehiculo coche2 = new Vehiculo("1235LZP");
            Vehiculo coche3 = new Vehiculo("1236LZP");
            Vehiculo coche4 = new Vehiculo("1237LZP");
            Vehiculo coche5 = new Vehiculo("1238LZP");
            ParkingVehiculo parkingCortes = new ParkingVehiculo("cortes 1 Madrid");
            parkingCortes.aparcaCoche(coche1);
            parkingCortes.aparcaCoche(coche2);
            parkingCortes.aparcaCoche(coche3);
            parkingCortes.aparcaCoche(coche4);
            parkingCortes.aparcaCoche(coche5);
            // Espero 2 minutos
            Thread.sleep(120 * 1000);
            parkingCortes.sacaCoche(coche1);
            parkingCortes.sacaCoche(coche2);
            parkingCortes.sacaCoche(coche3);
            parkingCortes.sacaCoche(coche4);
            parkingCortes.sacaCoche(coche5);
            double dFactura1 = parkingCortes.getFactura(coche1);
            double dFactura2 = parkingCortes.getFactura(coche2);
            double dFactura3 = parkingCortes.getFactura(coche3);
            double dFactura4 = parkingCortes.getFactura(coche4);
            double dFactura5 = parkingCortes.getFactura(coche5);
            System.out.println(coche1 + "; Factura=" + dFactura1);
            System.out.println(coche2 + "; Factura=" + dFactura2);
            System.out.println(coche3 + "; Factura=" + dFactura3);
            System.out.println(coche4 + "; Factura=" + dFactura4);
            System.out.println(coche5 + "; Factura=" + dFactura5);
        } catch (Exception e) {
            e.printStackTrace();

        }
    }

}
