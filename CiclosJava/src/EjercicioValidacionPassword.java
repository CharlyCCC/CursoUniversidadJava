import java.util.Scanner;

public class EjercicioValidacionPassword {
    public static void main(String[] args) {
        System.out.println("*** Sistema Validación Password ***");

        /*
        Sistema para validar la creación de una contraseña.

        Debe tener mínimo 6 caracteres. (solicitar que se cumpla la condición hasta que se cumpla)

        Si la contraseña es válida, imprimir "Contraseña válida" + contraseña y finalizar la ejecución del sistema.

         */
        Scanner consola = new Scanner(System.in);
        final int CHAR_MIN = 6;
        String pass;
        boolean passValido = false;

        while (!passValido){
            System.out.print("Ingrese su nueva contraseña: ");
            pass = consola.nextLine();
            if (pass.length()>=CHAR_MIN){
                System.out.printf("Contraseña válida, su contraseña es: %s",pass);
                passValido = true;
            }else {
                System.out.println("Longitud insuficiente, corrija su contraseña...");
            }
        }


    }
}
