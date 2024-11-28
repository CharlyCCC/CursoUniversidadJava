public class CaracteresEspeciales {
    public static void main(String[] args) {
        //Caracteres Especiales
        // \n - imprimir salto de línea
        var cadena1 = "Hola\nMundo";
        System.out.println("cadena1 = " + cadena1);

        //'\t' - Tabulador
        var cadena2 = "Hola\tMundo";
        System.out.println("cadena2 = " + cadena2);

        // '\'' - Agregar comilla simple
        var cadena3 = "Hola\'Mundo";
        System.out.println("cadena3 = " + cadena3);
        cadena3 = "Hola ' Mundo";
        System.out.println("cadena3 = " + cadena3);

        // '\"' - Agrega comilla doble
        var cadena4 = "Hola\"Mundo";
        System.out.println("cadena4 = " + cadena4);

        // '\\' - Agregar diagonal invertida
        var cadena5 = "Hola\\ \\Mundo";
        System.out.println("cadena5 = " + cadena5);








    }
}
