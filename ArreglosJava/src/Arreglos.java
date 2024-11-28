import java.util.Scanner;

public class Arreglos {
    public static void main(String[] args) {
        System.out.println("*** Declaración Arreglo ***");
        Scanner consola = new Scanner(System.in);
/*
        //1.Declarar arreglo
        int [] enteros; //Se crea en la memoria STACK (pila) donde sólo se hace referencia de la memoria

        //2.Inicializar arreglo
        enteros = new int[3]; //Se reservaron 3 celdas de memoria localmente en el método main en memora HEAP (donde se almacena el objeto).


        //Declarar e inicializar arreglo
        int[] numeros = new int[12]; // Si se usa 'var', en la segunda sección se debe indicar el tipo de valor (var numeros = new int[12];)

 */

        //Declarar e inicializar arreglo
        int[] enteros = new int[5];

        //Modificar los elementos
        enteros[0] = 13;
        enteros[1] = 21;
        enteros[4] = 62;

        //Lectura de valores
        //System.out.println("Valor 1: " + enteros[0]+" "+enteros[4]);
        for (int i=0;i<=4;i++){
            System.out.println("Casilla/índice: "+i+"  Valor: "+enteros[i]+" ");
        }
        System.out.println("\n");

        //Sintaxis simplificada de arreglos
        int [] enteros2 = {100,200,300,400,500};
        var enteros3 = new int[]{1100,2200,3300,4400,5500};

        for(int i=0;i<=4;i++){
            System.out.println("Casilla/índice: "+i+"  Valor: "+enteros2[i]+" ");
        }

        System.out.println("\n");

        for(int i=0;i<=4;i++){
            System.out.println("Casilla/índice: "+i+"  Valor: "+enteros3[i]+" ");
        }
        System.out.println("\nImprimir dirección de memoria Heap: "+ enteros3+" \n");

        //
        System.out.println("Arreglo con length del arreglo");
        System.out.println("Tamaño del arreglo 'enteros'= "+enteros.length);
        for(int i=0;i<enteros.length;i++){
            System.out.print(enteros[i]+" ");
        }


        //Introducir valores dinámicamente a un arreglo
        System.out.println("%n%nIntroducir valores a un arreglo: ");

        //Declarar arreglo
        System.out.println("Proporciona el largo del arreglo: ");
        int largoArreglo = consola.nextInt();
        //Crear de manera dinámica el arreglo
        var enteros4 = new int[largoArreglo];
        //Solicitar los valores del arreglo
        for (int i=0;i<largoArreglo;i++){
            System.out.print("Proporciona el valor del índice ["+i+": ");
            enteros4[i]= consola.nextInt();
        }
        //Imprimimr valores del arreglo
        for (int i=0;i<largoArreglo;i++){
            System.out.print("Indice ["+i+"]: "+enteros4[i]+" ");
        }

    }
}
