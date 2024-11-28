public class FormateoCadenas {
    public static void main(String[] args) {
        String nombre = "Matías";
        int edad = 35;
        double salario = 21000.9999;

        //String.format (%s=String, %d=Decimal, %.2f= .2 para indicar número de decimales y "f" para indicar que es tipo flotante)
        var mensaje = String.format("Nombre: %s, Edad: %d, Salario: $%.2f", nombre,edad,salario);
        System.out.println(mensaje);


        //Método printf //%n = salto de línea
        System.out.printf("Nombre: %s, Edad: %d, Salario: $%.2f%n",nombre,edad,salario);


        //Formateo con Text Block
        //"\s" = Espacio en blanco
        //%04d = le da formato que incluya siempre 4 dígitos, rellenando con '0' los números faltantes a la izquierda.
                //Si sobre pasa ese formato, ya no es necesario rellenar
                //0=Número con el que se rellena
                //4=Cantidad de dígitos del formato
                //d=Formato Decimal

        var numeroEmpleado = 1;
        mensaje ="""
                %nDetalle de la persona:\s
                --------------------------
                \tNombre: %s
                \tN° Empleado: %04d
                \tEdad: %d años
                \tSalario: $%.2f
                """.formatted(nombre,numeroEmpleado,edad,salario);
        System.out.println(mensaje);

        //Formateo con TextBlock y printf directamente
        numeroEmpleado = 12122;

        System.out.printf("""
                %nDetalle de la persona:\s
                --------------------------
                \tNombre: %s
                \tN° Empleado: %04d
                \tEdad: %d años
                \tSalario: $%.2f
                """, nombre,numeroEmpleado,edad,salario);

    }
}
