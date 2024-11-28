public class ComparacionCadenas {
    public static void main(String[] args) {
        //Comparación de cadena (pool de cadenas)

        String cadena1 = "Java";
        var cadena2 = "Java";
        var cadena3 = new String("Java");

        //Comparación de cadenas (==) comparación de la referencia
        System.out.print("cadena1 es igual en referencia a cadena 2: ");
        System.out.println(cadena1 == cadena2);

        //Comparamos cadena1 con cadena3 (referencias)
        System.out.print("cadena1 es igual en referencia a cadena3: ");
        System.out.println(cadena1 == cadena3);


        //Comparar contenido, usamos método "equals"
        System.out.print("cadena1 es igual en contenido a cadena3: ");
        System.out.println(cadena1.equals(cadena3));





    }
}
