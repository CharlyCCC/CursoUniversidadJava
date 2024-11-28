import java.util.Scanner;

public class EjercicioCalculadora {
    public static void main(String[] args) {
        System.out.println("*** Calculadora ***");

        /*
        Calculadora con las opciones de suma, resta, multiplicación y división.

        Debe mostrar un menú con las opciones y solicitar los operandos (valor 1 y 2) par realizar la operación.
        Realizar la operación seleccionada.

         */
        Scanner consola = new Scanner(System.in);
        double valor1;
        double valor2;
        int opcion;
        boolean salir = false;

        while (!salir) {
            System.out.print("""
                    \nSeleccione la operación desea realizar:
                    \t1. Suma
                    \t2. Resta
                    \t3. Multiplicación
                    \t4. División
                    \t5. Salir
                    :\s""");
            opcion = consola.nextInt();

            switch (opcion){
                case 1 -> {
                    System.out.print("Suma\nIngrese el primer dígito: ");
                    valor1 = consola.nextDouble();
                    System.out.print("Ingrese el segundo dígito: ");
                    valor2 = consola.nextDouble();
                    double suma = valor1+valor2;

                    System.out.printf("El resultado de sumar %.2f + %.2f es: %.2f%n%n",valor1,valor2,suma);
                }
                case 2 -> {
                    System.out.print("Resta\nIngrese el primer dígito: ");
                    valor1 = consola.nextDouble();
                    System.out.print("Ingrese el segundo dígito: ");
                    valor2 = consola.nextDouble();
                    double resta = valor1-valor2;
                    System.out.printf("El resultado de restar %.2f - %.2f es: %.2f%n%n",valor1,valor2,resta);
                }
                case 3 -> {
                    System.out.print("Multiplicación\nIngrese el primer dígito: ");
                    valor1 = consola.nextDouble();
                    System.out.print("Ingrese el segundo dígito: ");
                    valor2 = consola.nextDouble();
                    double multiplicacion = valor1*valor2;
                    System.out.printf("El resultado de multiplicar %.2f * %.2f es: %.2f%n%n",valor1,valor2,multiplicacion);
                }
                case 4 -> {
                    System.out.print("División\nIngrese el primer dígito: ");
                    valor1 = consola.nextDouble();
                    System.out.print("Ingrese el segundo dígito: ");
                    valor2 = consola.nextDouble();
                    if (valor2 != 0) {
                        double division = valor1 / valor2;
                        System.out.printf("El resultado de dividir %.2f / %.2f es: %.2f%n%n", valor1, valor2, division);
                    }else {
                        System.out.println("Error, división entre 0.\n");
                    }
                }
                case 5 -> {
                    System.out.print("Hasta la próxima...");
                    salir = true;
                }
                default -> System.out.println("Opción inválida. Elija nuevamente...");
            };
        }
    }
}
