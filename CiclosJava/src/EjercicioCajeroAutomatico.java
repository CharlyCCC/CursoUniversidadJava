import java.util.Scanner;

public class EjercicioCajeroAutomatico {
    public static void main(String[] args) {
        /*
        Funciones principales: depositar, retirar y consultar saldo + salir

        El saldo puede tener un valor inicial de $1,000.00

        Si se hace un retiro, se resta del saldo, si depositas, se suma.
        Si no tiene saldo, advertir que no puede retirar más de lo que tiene.
        Opciona: imprimir el resumen de la operación con su saldo.

         */

        System.out.println("*** Sistema Cajero Automático ***");
        Scanner consola = new Scanner(System.in);

        double saldo = 1000;
        double deposito = 0;
        double retiro = 0;
        int opcion;
        boolean salir = false;

        System.out.println("Bienvenid@ al sistema del Banco X");
        while (!salir) {
            System.out.print("""                                  
                    Elija la operación a realizar:                    
                    \t1. Consultar saldo
                    \t2. Depositar
                    \t3. Retirar
                    \t4. Salir                   
                    :\s""");
            opcion = consola.nextInt();

            switch (opcion){
                case 1 -> System.out.printf("Su saldo es de: $%.2f\n",saldo);
                case 2 -> {
                    System.out.print("Digite el monto a depositar: ");
                    deposito = consola.nextDouble();
                    saldo += deposito;
                    System.out.printf("Su saldo total actual es de: $%.2f\n",saldo);
                }
                case 3 -> {
                    System.out.printf("Su saldo actual es de: $%.2f\n",saldo);
                    if (saldo == 0){
                        System.out.println("Usted no cuenta con saldo suficiente para realizar retiros.\n");
                    }else {
                        System.out.print("Digite la cantidad a retirar: ");
                        retiro = consola.nextDouble();
                        if (retiro <= saldo){
                            saldo -=retiro;
                            System.out.printf("Su saldo actual es de: $%.2f\n",saldo);
                        }else if (retiro > saldo){
                            System.out.println("No cuenta con saldo en su cuenta para hacer el retiro de esa cantidad.\n");
                        }
                    }
                }
                case 4 -> {
                    System.out.println("Saliendo... Saludos!!");
                    salir = true;
                }
            }
        }
    }
}
