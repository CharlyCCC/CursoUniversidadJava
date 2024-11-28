import java.util.Scanner;

public class SistemaEmpleados {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        String nombreEmpleado;
        int edadEmpleado;
        double salarioEmpleado;
        boolean esJefe;

        //Nombre empleado
        System.out.print("Ingrese el nombre del empleado: ");
        nombreEmpleado =consola.nextLine();
        //Edad empleado
        System.out.print("Ingrese la edad del empleado: ");
        edadEmpleado = Integer.parseInt(consola.nextLine());
        //Salario empleado
        System.out.print("Ingrese el salario del empleado: ");
        salarioEmpleado = Double.parseDouble(consola.nextLine());
        //¿Es Jefe?
        System.out.print("¿El empleado, es jefe?: (true/false)");
        esJefe = Boolean.parseBoolean(consola.nextLine());
        String esJefeMod;
        if(esJefe == true){
            esJefeMod = "Si";
        }else{
            esJefeMod = "No";
        }

        //Imprimir datos del empleado
        System.out.println("\nDatos del empleado: ");
        System.out.println("\tNombre: " + nombreEmpleado);
        System.out.println("\tEdad: " + edadEmpleado);
        //Salario sin formato
        System.out.println("\tSalario: " + salarioEmpleado);
        //Salario con formato a dos dígitos decimales con formatted
        System.out.println("\tSalario: $%.2f".formatted(salarioEmpleado));
        //Salario con formato simplificado con printf en lugar de println y dos decimales, se le agrega "%n" para salto de línea
        System.out.printf("\tSalario: $%.2f%n",salarioEmpleado);
        System.out.println("\t¿Es Jefe de Dpto.?: " + esJefeMod);


    }
}
