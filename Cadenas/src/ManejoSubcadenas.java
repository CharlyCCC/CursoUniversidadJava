public class ManejoSubcadenas {
    public static void main(String[] args) {
        //Tema de subcadenas: obtener una parte del una cadena original con "subtring" (el último índice no se incluye)
        //substring(índice de inicio, índice final(sin incluirlo))

        String cadena1 = "Hola Mundo";
        System.out.println("cadena1 = " + cadena1);

        //Subcadena
        var subcadena1 = cadena1.substring(0, 4);
        System.out.println("subcadena1 = " + subcadena1);

        //Este método regresa la cadena a partir del índice hasta el final de la cadena referenciada
        var subcadena2 = cadena1.substring(5);
        System.out.println("subcadena2 = " + subcadena2);
        


    }
}
