public class EjercicioAcumuladorSuma {
    public static void main(String[] args) {
        System.out.println("*** Ejercicio Suma Iterativa(Acumulariva) ***");

        final int MAXIMO = 5;

        int contador = 0;
        int acumuladorSuma = contador;


        while (contador <= MAXIMO){

            //Imprimir lo que se está sumando
            System.out.println("acumuladorSuma + contador -> " +acumuladorSuma + " + " + contador);

            //También puede ser la operación de la siguiente manera:
            acumuladorSuma += contador++; //Equivale a: acumuladorSuma = acumuladorSuma +contador;
            System.out.print("Suma Parcial acumulada " + acumuladorSuma + "\n\n");

            //System.out.println(acumuladorSuma);
        }
        System.out.println("Suma de los primeros "+MAXIMO+" números: "+acumuladorSuma);


        System.out.println("\n\n*** Suma Acumulada For ***");

        acumuladorSuma=0; // Si se comenta esta variable, se seguirá con el valor que le quedó del ciclo anterior.
        for(contador=0;contador<=MAXIMO;contador++){
            //Imprimir lo que se está sumando
            System.out.println("acumuladorSuma + contador -> " +acumuladorSuma + " + " + contador);

            //Operación
            acumuladorSuma += contador; //Equivale a: acumuladorSuma = acumuladorSuma +contador;
            System.out.print("Suma Parcial acumulada " + acumuladorSuma + "\n\n");
        }
        System.out.println("Suma de los primeros "+MAXIMO+" números: "+acumuladorSuma);


        System.out.println("\n\n*** Suma Acumulada Do-While ***");
        acumuladorSuma = 0;
        contador = 0;
        do {
            //Imprimir lo que se está sumando
            System.out.println("acumuladorSuma + contador -> " +acumuladorSuma + " + " + contador);

            //Operación
            acumuladorSuma += contador++; //Equivale a: acumuladorSuma = acumuladorSuma +contador;
            System.out.print("Suma Parcial acumulada " + acumuladorSuma + "\n\n");
        }while (contador <= MAXIMO);

        System.out.println("Suma de los primeros "+MAXIMO+" números: "+acumuladorSuma);
    }
}
