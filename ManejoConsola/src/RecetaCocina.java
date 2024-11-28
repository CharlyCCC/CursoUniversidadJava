import java.util.Scanner;

public class RecetaCocina {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);

        String nombreRececta;
        String ingredietesPrincipales;
        int tiempoPreparacion;
        String dificultad;

        System.out.print("Nombre la receta a preparar: ");
        nombreRececta = consola.nextLine();
        System.out.print("Liste los principales ingredientes: ");
        ingredietesPrincipales = consola.nextLine();
        System.out.print("Indique el tiempo de preparación(min): ");
        tiempoPreparacion = Integer.parseInt(consola.nextLine());
        System.out.print("Indique la dificultad de la receta(Fácil/Media/Difícil): ");
        dificultad = consola.nextLine();

        //Imprimir receta
        System.out.println("nombreRececta: " + nombreRececta);
        System.out.println("ingredietesPrincipales: " + ingredietesPrincipales);
        System.out.println("tiempoPreparacion: "+ tiempoPreparacion+"(min)");
        System.out.println("dificultad: " + dificultad);



    }
}
