package aritmetica.prueba;

import aritmetica.Aritmetica;

public class PruebaAritmetica {
    public static void main(String[] args) {
        System.out.println("*** Ejemplo Aritmética ***");
        //Intanciando Objeto1
        var aritmetica1 = new Aritmetica(5,7);
        System.out.println("Atributo Operando1: " + aritmetica1.getOperando1());
        aritmetica1.setOperando1(10);
        System.out.println("aritmetica1.getOperando1() = " + aritmetica1.getOperando1());
        aritmetica1.setOperando2(15);
        aritmetica1.sumar();
        aritmetica1.restar();
        System.out.println();

        //Intanciando Objeto2
        var aritmetica2 = new Aritmetica(12,16);
        aritmetica2.sumar();
        aritmetica2.restar();



    }
}
