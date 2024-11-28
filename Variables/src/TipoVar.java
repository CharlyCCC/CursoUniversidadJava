public class TipoVar {
    public static void main(String[] args) {
        System.out.println("Uso de var en Java");
        //Sin el uso de var
        String nombre = "Juan";
        System.out.println("nombre = " + nombre);

        //Con el uso de var
        var nombre2 = "Carlos"; //Se infire String
        System.out.println("nombre2 = " + nombre2);

        var edad = 32; //Se infire entero / int
        System.out.println("edad = " + edad);

        var sueldo = 300.50; //Se infire long
        var sueldo2 = 500.30F; //Se infire float
        var esCasado = false; //Se infire boolean
        //var esCasado = "No"; //No podemos asignar un tipo distinto

        /*
        Se debe definir su valor desde el inicio. El siguiente ejemplo arroja error
        (var precio;
        precio = 10;
         */

        //Se debe poder inferir el tipo de valor
        //var apellido = null; //No se puede inferir tipo de dato




    }
}
