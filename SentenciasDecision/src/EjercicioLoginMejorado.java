import java.util.Scanner;

public class EjercicioLoginMejorado {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);

        //Constantes
        final String USER = "Admin";
        final String PSSWRD = "Pass";

        //Variables
        String usuario;
        String password;
        boolean validacionUsuario;
        boolean validacionPassword;


        System.out.println("Sign In");
        System.out.print("Ingrese su usuario: ");
        usuario = consola.nextLine();
        System.out.print("Ingrese su contraseña: ");
        password = consola.nextLine();

        validacionUsuario = (USER.equals(usuario));
        validacionPassword = (PSSWRD.equals(password));


        if (validacionUsuario && validacionPassword){
            System.out.println("Bienvenid@ al sistema");
        } else if (validacionUsuario && !validacionPassword) {
            System.out.println("Contraseña Incorrecta");
        }else if (!validacionUsuario && validacionPassword){
            System.out.println("Usuario Incorrecto");
        }else {
            System.out.println("Usuario y contraseña incorrectos");
        }


        //Sistema SWITCH-CASE Mejorado
        System.out.println("\nMétodo SWITCH-CASE Mejorado");
        var acceso = switch (usuario){
            case USER -> {
                if (PSSWRD.equals(password)){
                    yield "Bienvenid@ al sistema";
                }else {
                    yield "Password incorrecto";
                }
            }
            default -> {
                if (PSSWRD.equals(password)){
                    yield "Usuario incorrecto";
                }else {
                    yield "Usuario y contraseña incorrectos";
                }
            }

        };
        System.out.println(acceso);
    }
}
