import java.util.Scanner;

public class EjercicioEstacionAnio {
    public static void main(String[] args) {
        System.out.println("*** Identificar la estación del año ***");
        Scanner consola = new Scanner(System.in);

        int valorMes;
        System.out.print("Ingrese en número del mes(1-12): ");
        valorMes = consola.nextInt();


        System.out.println("Método IF-ELSE");
        if (valorMes == 12 || valorMes == 1 || valorMes == 2){
            System.out.println("Es Invierno");
        } else if (valorMes == 3 || valorMes == 4 || valorMes == 5) {
            System.out.println("Es Primavera");
        } else if (valorMes == 6 || valorMes == 7 || valorMes == 8) {
            System.out.println("Es Verano");
        } else if (valorMes == 9 || valorMes == 10 || valorMes == 11) {
            System.out.println("Es Otoño");
        }else {
            System.out.println("Valor NO válido");
        }

        System.out.println("");

        System.out.println("Método SWITCH-CASE");
        switch (valorMes){
            case 12,1,2: {//NOTA: En caso de que mande imprimir mas de una sentencia, se deberá encapsular el case en llaves {}
                System.out.println("Es Invierno");
                System.out.println("Segunda sentencia");
            }
                break;
            case 3,4,5:
                System.out.println("Es Primavera");
                break;
            case 6,7,8:
                System.out.println("Es Verano");
                break;
            case 9,10,11:
                System.out.println("Es Otoño");
                break;
            default:
                System.out.println("Valor NO válido");
        }



        //NOTA 2: cuando se use un tipo de SWITCH (clásico o mejorado) no se podrán mezclar los dos métodos en la misma línea de código
        System.out.println("\nMétodo SWITCH-CASE Mejorado");
        String estacion;
        estacion = switch (valorMes){
            case 12,1,2 -> "Invierno";
            case 3,4,5 -> "Primavera";
            case 6,7,8 -> "Verano";
            case 9,10,11 -> "Otoño";
            default -> "Valor Inválido";
        };
        System.out.println(estacion);

    }
}
