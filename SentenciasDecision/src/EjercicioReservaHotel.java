import java.util.Scanner;

public class EjercicioReservaHotel {
    public static void main(String[] args) {
        System.out.println("*** Sistema de Reservas ***");
        Scanner consola = new Scanner(System.in);

        //Variables
        String nombreHuesped;
        int diasEstancia;
        boolean tieneVistaMar;
        double totalEstancia;
        //String vista;

        //Constantes
        final double CON_VISTA_MAR = 190.50;
        final double SIN_VISTA_MAR = 150.50;

        System.out.print("Ingrese su nombre: ");
        nombreHuesped = consola.nextLine();
        System.out.print("¿Cuántos días desea reservar?: ");
        diasEstancia = consola.nextInt();
        System.out.print("¿Desea habitación con vista al mar? (true/false): ");
        //vista = consola.nextLine();
        tieneVistaMar = consola.nextBoolean();


        if (tieneVistaMar){
            totalEstancia = CON_VISTA_MAR * diasEstancia;
        }else {
            totalEstancia = SIN_VISTA_MAR * diasEstancia;
        }

        System.out.printf("""
                    Su resumen de la reserva:
                    \tNombre del huésped: %s
                    \tDías de estancia: %d
                    \tHabitación con vista al mar: %s
                    
                    TOTAL: %.2f
                    """,nombreHuesped,diasEstancia,tieneVistaMar ? "SI":"NO",totalEstancia);

    }
}
