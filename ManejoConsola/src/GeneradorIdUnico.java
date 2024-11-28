import java.util.Random;
import java.util.Scanner;

public class GeneradorIdUnico {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner consola = new Scanner(System.in);

        String nombre;
        String nombreFormateado;
        String apellido;
        String apellidoFormateado;
        //También se puede usar directamente el tipo String para el año y así no tener que hacer las conversiones
        int anioNacimiento;
        int anioNacimientoFormateado;
        int numeroAleatorio = random.nextInt(9999)+1;
        String idUnico;


        System.out.print("Dame tu nombre: ");
        nombre = consola.nextLine();
        System.out.print("Dame tu apellido: ");
        apellido = consola.nextLine();
        System.out.print("Dame tu año de nacimiento: ");
        anioNacimiento = consola.nextInt();
        System.out.println("Su número único es: "+numeroAleatorio);


        nombreFormateado = nombre.toUpperCase().substring(0,2);
        apellidoFormateado = apellido.toUpperCase().substring(0,2);
        anioNacimientoFormateado = Integer.parseInt(String.valueOf(anioNacimiento).substring(2,4));
        idUnico = nombreFormateado+apellidoFormateado+anioNacimientoFormateado+numeroAleatorio;

        System.out.printf("""
                ***Detalles del Usuario***%n
                
                Nombre: %s
                Apellido: %s
                Año Nacimiento: %d
                Número Único: %04d
                Su ID es: %s
                """,nombre,apellido,anioNacimiento,numeroAleatorio,idUnico);

    }
}
