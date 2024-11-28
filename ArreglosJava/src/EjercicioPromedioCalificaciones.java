import java.util.Scanner;

public class EjercicioPromedioCalificaciones {
    public static void main(String[] args) {
        System.out.println("*** Promedio Calificaciones ***");
        Scanner consola = new Scanner(System.in);

        System.out.print("Indique la cantidad de calificaciones a agregar: ");
        int cantidadCalificaciones = consola.nextInt();
        var calificaciones= new double[cantidadCalificaciones];
        for (int i =0;i<cantidadCalificaciones;i++){
            System.out.print("Ingrese la primera calificación ["+i+"]: ");
            calificaciones[i] = consola.nextDouble();
        }
        double sumaCalificaciones = 0;
        for (int i =0; i<cantidadCalificaciones;i++){
            sumaCalificaciones = sumaCalificaciones +calificaciones[i];
        }
        double promedioCalificaciones = sumaCalificaciones / cantidadCalificaciones;

        System.out.println("\nEl promedio de sus calificaciones es de: "+promedioCalificaciones);

    }
}
