import java.util.Scanner;

public class EjercicioPrestamoLibros {
    public static void main(String[] args) {
        System.out.println("*** Sistema de Préstamo de Libros ***");

        Scanner consola = new Scanner(System.in);
        final int DISTANCIA_MAXIMA = 3;
        boolean tieneCredencial;
        int distanciaVivienda;

        System.out.print("¿Tiene credencial? (true/false): ");
        tieneCredencial = consola.nextBoolean();
        System.out.print("¿A qué distancia en KM vive de la biblioteca?: ");
        distanciaVivienda = consola.nextInt();

        var esCandidatoPrestamo = tieneCredencial == true || distanciaVivienda <= DISTANCIA_MAXIMA;
        System.out.println("¿Es usted candidado a préstamo?: " + esCandidatoPrestamo);
    }
}
