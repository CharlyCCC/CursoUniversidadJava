import java.util.Scanner;

public class EjercicioValorPositivo {
    public static void main(String[] args) {
        System.out.println("*** Saber si un número es positivo ***");

        Scanner consola = new Scanner(System.in);

        System.out.print("Ingrese un valor entero: ");
        int valor = consola.nextInt();

        if (valor > 0){
            System.out.println("El valor es Positivo");
        } else if (valor < 0) {
            System.out.println("El valor es Negativo");

        }else {
            System.out.println("El valor es 0");
        }

    }
}
