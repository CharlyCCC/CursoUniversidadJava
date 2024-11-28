public class PalabraBreakContinue {
    public static void main(String[] args) {
        System.out.println("*** Palabra 'Break' y 'Continue' ***");

        //Ejemplo break, imprimir solo el primer numero par
        System.out.println("\nPalabra break: ");
        for (int i=1;i<=9;i++){
            if (i%2 ==0){
                System.out.print(i + " ");
                break; //Rompe de manera "prematura" un ciclo
            }
        }


        //Ejemplo continue, imprimir solo pares, ignorar impares
        System.out.println("\nPalabra continue: ");
        for (int numero=1; numero<10;numero++){
            if (numero %2 ==1){ //numero impar
                continue; //saltamos a la siguiente iteración
            }else {
                System.out.print(numero + " "); //numeros pares
                //break;
            }
        }
    }
}
