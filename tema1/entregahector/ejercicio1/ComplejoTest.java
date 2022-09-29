package main.entregahector.ejercicio1;

import java.text.DecimalFormat;

public class ComplejoTest {
    public static void main(String[] args) {
        //crear c1
        Complejo comPrueba1 = new Complejo();
        //asignar c1()
        comPrueba1.Asignar((Math.random()*25+1), (Math.random()*25+1));
        //crear c2
        Complejo comPrueba2 = new Complejo();
        //asignar c2()
        comPrueba2.Asignar((Math.random()*25+1), (Math.random()*25+1));
        //crear c3
        Complejo comPrueba3 = new Complejo();
        //sumar() c3=(c1+c2)
        comPrueba3.sumaComplejo(comPrueba1, comPrueba2);
        //imprimir()
        System.out.println("1 "+comPrueba1.toString());
        System.out.println("2 "+comPrueba2.toString());
        System.out.println("3 "+comPrueba3.toString());
        

    }
}
