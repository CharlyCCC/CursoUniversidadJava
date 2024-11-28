import java.util.Scanner;

public class EjercicioSistemaAdminCuentas {
    public static void main(String[] args) {
        System.out.println("*** Sistema Administrador de Cuentas ***");
        Scanner consola = new Scanner(System.in);

        int opcion;
        do {
            System.out.print("""
                    *** Sistema Administrador de Cuentas (Do-While/IF-ELSE) ***
                    MENU:
                    \t1. Crear cuenta
                    \t2. Eliminar cuenta
                    \t3. Salir
                    
                    Escoja una opción:\s
                    """);
            opcion = consola.nextInt();
            if (opcion == 1){
                System.out.println("Creando tu cuenta...\n");
            }else if (opcion == 2){
                System.out.println("Eliminando tu cuenta...\n");
            } else if (opcion == 3) {
                System.out.println("Saliendo del sistema... \nAdios!");
            }else {
                System.out.println("Opción incorrecta, seleccione otra\n");
            }
        }while (opcion != 3);


        //Ciclo While con Switch Mejorado

        System.out.println("\nSistema con While y Switch Mejorado");
        boolean salir = false;
        while (!salir){
            System.out.print("""
                    *** Sistema Administrador de Cuentas ***
                    MENU:
                    \t1. Crear cuenta
                    \t2. Eliminar cuenta
                    \t3. Salir
                    
                    Escoja una opción:\s
                    """);
            opcion = consola.nextInt();

            switch (opcion){
                case 1 -> System.out.println("Creando cuenta...");
                case 2 -> System.out.println("Eliminando cuenta...");
                case 3 -> {
                    System.out.println("Saliendo del sistema. Adios!!");
                    salir = true;
                }
                default -> System.out.println("Opción incorrecta. Elige otra...");
            }

        }

    }
}
