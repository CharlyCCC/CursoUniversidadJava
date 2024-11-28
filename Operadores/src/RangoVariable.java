import java.util.Scanner;

public class RangoVariable {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.print("Proporciona un dato entero: ");
        int dato = Integer.parseInt(consola.nextLine());

        //Revisamos si está dentro del rango de 1 a 10
        boolean estaDentroRango = dato >=1 && dato <= 10;

        System.out.println("¿Esta Dentro del Rango?: " + estaDentroRango);

        //Revisar si estamos fuera de rango (lógica inversa)
        boolean estaFueraRango = !(dato >=1 && dato <= 10);
        System.out.println("¿Esta Fuera del Rango?: " + !estaDentroRango);
        System.out.println("¿Esta Fuera del Rango?: " + estaFueraRango);


    }
}
