public class MetodosDeCadenas {
    public static void main(String[] args) {
        //Métodos de cadenas
        String cadena1 = "Hola Mundo";

        //Obtener el largo de una cadena
        var longitud = cadena1.length();
        System.out.println("longitud = " + longitud);


        //Reemplazar caracteres
        var nuevaCadena = cadena1.replace('o','a');
        System.out.println("nuevaCadena = " + nuevaCadena);

        //Convertir a mayúsculas
        var mayusculas = cadena1.toUpperCase();
        System.out.println("mayusculas = " + mayusculas);

        //Convertir a minúsculas
        var minusculas = cadena1.toLowerCase();
        System.out.println("minusculas = " + minusculas);
        //También se puede hacer de este modo:
        System.out.println("minusculas = " + cadena1.toLowerCase());

        //Eliminar espacios al inicio y al final de la cadena
        var cadena2 = "     Leo Reyes   ";
        System.out.println("cadena2 = " + cadena2);
        System.out.println("cadena2 = " + cadena2.trim());

        //




    }
}
