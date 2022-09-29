package main.entregahector.ejercicio2;

public class OrdenadorTestHector {
    public static void main(String[] args) {
        Portatil port1=new Portatil("01", 8, "i5", 100,1.5);
        Portatil port2=new Portatil("02", 32, "i7", 400,1);
        Sobremesa sobremesa1=new Sobremesa("03", 8, "i5", 200,"Silver Ryzen7");
        Sobremesa sobremesa2=new Sobremesa("04", 16, "i7", 300,"HP Pavilion");
        System.out.println(port1.toString());
        System.out.println(port2.toString());
        System.out.println(sobremesa1.toString());
        System.out.println(sobremesa2.toString());
    }
}
