import java.util.Scanner;

public class ManejoConsola {
    public static void main(String[] args) {
        //Introducir valores por consola
        var consola = new Scanner(System.in); //in - input o entrada de datos estándar (por consola)
        System.out.print("Escribe tu nombre: ");
        var nombre = consola.nextLine();
        System.out.println("nombre = " + nombre);


    }
}
