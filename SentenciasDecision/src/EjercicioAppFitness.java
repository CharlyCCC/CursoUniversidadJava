import java.util.Scanner;

public class EjercicioAppFitness {
    public static void main(String[] args) {
        System.out.println("*** App Fitness ***");
        Scanner consola = new Scanner(System.in);

        String nombreUsuario;
        int pasosCaminados;
        final int META_PASOS_DIARIOS = 10000;
        final double CALORIAS_POR_PASO = 0.04;
        double caloriasQuemadas;

        System.out.print("Ingrese su nombre: ");
        nombreUsuario = consola.nextLine();
        System.out.print("¿Cuántos pasos dio el día de hoy?: ");
        pasosCaminados = consola.nextInt();

        caloriasQuemadas = pasosCaminados * CALORIAS_POR_PASO;
        var metaAlcanzada = (pasosCaminados >= META_PASOS_DIARIOS) ? "SÍ :)" : "NO :(";
        if (pasosCaminados >= META_PASOS_DIARIOS){
            System.out.printf("""
                    ¡GENIAL!
                    %s, %s alcanzaste la meta de pasos diarios.
                    Aquí su resumen:
                    \tPasos dados hoy: %d
                    \tCalorías quemadas: %.2f
                    """,nombreUsuario,metaAlcanzada,pasosCaminados,caloriasQuemadas);
        }else {
            System.out.printf("""
                    %s, %s alcanzaste la meta de pasos diarios.
                    Su resumen de hoy:                    
                    \tPasos dados hoy: %d (Meta no alcanzada :( )
                    \tCalorías quemadas: %.2f
                    """,nombreUsuario,metaAlcanzada,pasosCaminados,caloriasQuemadas);
        }


    }
}
