public class ReemplazarSubcadenas {
    public static void main(String[] args) {
        //Reemplazar Subcadenas
        String cadena= "Hola Mundo";
        System.out.println("Cadena original = " + cadena);
        System.out.println(" ");

        //Reemplazar "Mundo" por "a todos"
        var nuevaCadena = cadena.replace("Mundo","a todos");
        System.out.println("nuevaCadena = " + nuevaCadena);
        var nuevaCadena2 = nuevaCadena.replace("Hola","Adios");
        System.out.println("nuevaCadena2 = " + nuevaCadena2);

        //Reemplazar "Hola" por "Adios"
        nuevaCadena = cadena.replace("Hola", "Adios");
        System.out.println(" ");
        System.out.println("nuevaCadena = " + nuevaCadena);
        var nuevaCadena3 = nuevaCadena.replace("Hola","Adios");
        System.out.println("nuevaCadena3 = " + nuevaCadena3);


    }
}
