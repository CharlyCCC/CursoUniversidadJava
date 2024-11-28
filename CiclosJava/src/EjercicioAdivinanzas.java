import java.util.Random;
import java.util.Scanner;

public class EjercicioAdivinanzas {
    public static void main(String[] args) {
        System.out.println("*** Juego de Adivinanzas ***");

        /*
        El jugador debe adivinar el número secreto

        número random entre 1-50

        Con cada intento fallido, incrementar la variable de intentos fallidos
        El juego debe orientar al jugador para
        decirle si el número ingresado fue mayor o menor al número secreto


        Cuando adivine, debe indicar el número de intentos que realizó

        Opcional: limitar el número de intentos a máximo 10 y terminar el juego.


         */
        Scanner consola = new Scanner(System.in);
        Random numeroRandom = new Random();

        //final int INTENTOS_MAX = 5;
        int intentos = 1;
        int numeroIntento;
        int intentosRestantes = 4;
        int numeroSecreto = numeroRandom.nextInt(51+1);
        boolean finJuego = false;


        System.out.print("Hola, en este juego, debes adivinar el número del 1 al 50\n¿Listo?");
        System.out.println("Testigo: "+numeroSecreto);
        while (!finJuego) {
            System.out.print("Ingrese el su numero: ");
            //System.out.println("Testigo: "+numeroSecreto);
            numeroIntento = consola.nextInt();
            if (numeroIntento == numeroSecreto && intentosRestantes >= 1){
                    System.out.println("%n%n ¡¡GENIAL!!");
                    System.out.println("El número es correcto: El número secreto es -> "+numeroSecreto+", El número ingresado: "+numeroIntento);
                    System.out.println("Usted intentó: "+intentos+" veces.");
                    System.out.println("Intentos Restantes: "+intentosRestantes);
                    finJuego = true;

                } else if (numeroIntento > numeroSecreto && intentosRestantes >= 1) {
                System.out.println("Testigo: "+numeroSecreto);
                System.out.println("Numero incorrecto. Pista: debe ser menor al ingresado.");
                System.out.println("Intentos realizados: "+intentos++);
                System.out.println("Intentos Restantes: "+intentosRestantes--);

            } else if (numeroIntento < numeroSecreto && intentosRestantes >= 1) {
                System.out.println("Testigo: "+numeroSecreto);
                System.out.println("Numero incorrecto. Pista: debe ser Mayor al ingresado.");
                System.out.println("Intentos realizados: "+intentos++);
                System.out.println("Intentos Restantes: "+intentosRestantes--);

            } else if (intentosRestantes == 0) {
                System.out.println("Excediste el número de intentos, Game Over");
                finJuego = true;

            }
            /*else{
                    System.out.print("NÚMERO FUERA DE RANGO (1-50)");
                    System.out.println("Testigo: "+numeroSecreto);
                System.out.println("Intentos realizados: "+intentos++);
                System.out.println("Intentos Restantes: "+intentosRestantes--);
                }

             */
            }
        System.out.println("Testigo: "+numeroSecreto);
        System.out.println("Total de intentos: "+intentos);
        System.out.println("Intentos Restantes: "+intentosRestantes);
        }


   }

