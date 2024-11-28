import java.util.Scanner;

public class EjercicioConversionCalificacion {
    public static void main(String[] args) {
        System.out.println("*** Convertor de calificaciones ***");
        Scanner consola = new Scanner(System.in);

        System.out.print("Ingrese la calificación (0-10): ");
        double calificacionNumero = consola.nextDouble();
        String calificacionLetra ="";

        //NOTA: se podría usar el SWICH-CASE pero sólo si se compararan valores tipo int, no double o float
        if (calificacionNumero >= 9 && calificacionNumero == 10){
            calificacionLetra = "A";
        } else if (calificacionNumero >= 8 && calificacionNumero < 9) {
            calificacionLetra = "B";
        } else if (calificacionNumero >= 7 && calificacionNumero < 8) {
            calificacionLetra = "C";
        } else if (calificacionNumero >= 6 && calificacionNumero < 7) {
            calificacionLetra = "D";
        } else if (calificacionNumero >= 0 && calificacionNumero < 6) {
            calificacionLetra = "F";
        }else {
            calificacionLetra = "Calificación Inválida";
        }

        System.out.printf("Tu calificación de %.2f, equivale a: %s",calificacionNumero,calificacionLetra);

    }
}
