import java.util.Scanner;

public class FuncionPar {

    static boolean esPar(int numero){
        /*
        //Comprobación clásica
        if(numero % 2 == 0){
            return true;
        }else {
            return false;
        }
         */

        //Comprobación compacta con operador ternario
        return (numero % 2 == 0)? true : false;

    }

    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.print("Dame un número: ");
        int cantidad = consola.nextInt();

        boolean comprobarPar = esPar(cantidad);

        System.out.println("¿EL numero "+cantidad+" es Par? = " + comprobarPar);
    }
}
