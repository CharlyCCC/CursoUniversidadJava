public class BusquedaSubcadenas {
    public static void main(String[] args) {
        //Buscar subcadenas
        //indexOf - Devuelve el índice de la primera aparición de la subcadena
        String cadena1 = "Hola Hola Mundo Mundo";
        //Subcadena a buscar "Hola"
        var indice1 = cadena1.indexOf("Hola");
        System.out.println("indice1 = " + indice1);

        //lastIndexOf - devuelve el índice de la última aparición de la subcadena
        var indice2 = cadena1.lastIndexOf("Mundo");
        System.out.println("indice2 = " + indice2);

        //Subcadena no encontrada, retorna -1
        var indice3 = cadena1.indexOf("Java");
        System.out.println("indice3 = " + indice3);



    }
}
