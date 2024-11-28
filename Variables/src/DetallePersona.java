public class DetallePersona {
    public static void main(String[] args) {
        String nombre = "Carlos Sanchez";
        int edad = 32; //Si un valor no tiene punto flotante (float), la variable numérica en de tipo Integer
        double altura = 1.72; //todo valor flotante que no se especifique su tipo, es por default doble. Para especificar qué tipo de valor es, hay que agregar una F o f al final.
        String pais = "México";
        char casado = 'C';

        //Imprimir variables
        System.out.println(nombre);
        System.out.println(edad);
        System.out.println(altura);
        System.out.println(pais);
        //System.out.println(casado);
        //
        if (casado == 'C'){
            System.out.println("Casado/a");
        }else System.out.println("Soltero/a");


    }
}
