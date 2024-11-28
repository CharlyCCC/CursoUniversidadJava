import java.util.Scanner;

public class EjercicioSistemaEnvios {
    public static void main(String[] args) {
        System.out.println("*** Sistema de Envíos ***");
        Scanner consola = new Scanner(System.in);

        //Constantes
        final int TARIFA_INTERNACIONAL = 20;
        final int TARIFA_NACIONAL = 10;

        //Variables
        String destino = "";
        double pesoPaquete;

        System.out.print("Tipo de destino del paquete (NAC/INT): ");
        destino = consola.nextLine().toUpperCase().trim();
        System.out.print("Indique el peso del paquete: ");
        pesoPaquete = consola.nextDouble();


        double totalEnvio;
        System.out.println("Cálculo por IF-ELSE");
        if (destino.equals("INT")){
            totalEnvio = pesoPaquete * TARIFA_INTERNACIONAL;
            System.out.printf("El total de su envío es: %.2f",totalEnvio);
        } else if (destino.equals("NAC")) {
            totalEnvio = pesoPaquete * TARIFA_NACIONAL;
            System.out.printf("El total de su envío es: %.2f", totalEnvio);
        }else {
            System.out.println("Destino incorrecto");
        }


        System.out.println("");
        System.out.println("\nCálculo por SWITCH-CASE");
        var costoEnvio = switch (destino){
            case "INT" -> pesoPaquete * TARIFA_INTERNACIONAL;
            case "NAC" -> pesoPaquete * TARIFA_NACIONAL;
            default -> {
                System.out.println("Destino inválido");
                yield null;
            }
        };

        //Mostrar costo envío
        if (costoEnvio != null) {
            System.out.printf("El costo de su envío es de: $%.2f", costoEnvio);
        }




    }
}
