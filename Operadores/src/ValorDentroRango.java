import java.util.Scanner;

public class ValorDentroRango {
    public static void main(String[] args) {
        System.out.println("*** Valor dentro rango ***");
        final var MINIMO = 0;
        final var MAXIMO = 5;
        Scanner consola = new Scanner(System.in);
        //Solicitar un valor entre 0 y 5
        System.out.print("Proporciona un valor entre 0 y 5: ");
        var dato = Integer.parseInt(consola.nextLine());
        var dentroRango = dato >= MINIMO && dato <= MAXIMO;

        System.out.println("¿Está dentro de Rango?: " + dentroRango);


    }
}
