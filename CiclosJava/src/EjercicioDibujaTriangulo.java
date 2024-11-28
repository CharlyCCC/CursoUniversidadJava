import java.util.Scanner;

public class EjercicioDibujaTriangulo {
    public static void main(String[] args) {
        System.out.println("*** Dibuja Triángulo ***");
        Scanner consola = new Scanner(System.in);
        int filas;
        int numeroFilas;
        System.out.print("Proporciona el número de filas del triángulo: ");
        numeroFilas = consola.nextInt();

        //Iteramos sobre cada fila del triángulo
        for (filas =1;filas <= numeroFilas; filas++){
            var espaciosBlanco = " ".repeat(numeroFilas-filas);
            var asteriscos = "*".repeat(2*filas-1);
            System.out.println(espaciosBlanco+asteriscos);
        }
        //System.out.println("||");
        //System.out.println("||");
    }
}
