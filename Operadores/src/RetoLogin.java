import java.util.Scanner;

public class RetoLogin {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);

        System.out.println("*** Sistema de Autenticación ***");
        final String USER = "Admin";
        final String PASS= "Password";

        System.out.print("Proporcione el usuario: ");
        var usuario = consola.nextLine();
        System.out.print("Proporcione la contraseña: ");
        var contrasena = consola.nextLine();
        boolean comparacionParametros = USER.equals(usuario) && PASS.equals(contrasena);

        System.out.println("Los datos proporcionados son: " + comparacionParametros);

    }
}
