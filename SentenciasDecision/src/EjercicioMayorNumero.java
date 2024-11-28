import java.util.Scanner;

public class EjercicioMayorNumero {
    public static void main(String[] args) {
        System.out.println("*** Reto: Saber el mayor de dos números ***");
        Scanner consola = new Scanner(System.in);

        System.out.print("Ingrese el primer valor: ");
        int valor1 = consola.nextInt();
        System.out.print("Ingrese el segundo valor: ");
        int valor2 = consola.nextInt();

        if (valor1 > valor2){
            System.out.printf("El primer valor (%d) es mayor que %d",valor1,valor2);
        } else if (valor1 < valor2) {
            System.out.printf("El segundo valor (%d) es mayor que %d",valor2,valor1);

        }else {
            System.out.printf("Ambos valores son iguales");
        }
    }
}
