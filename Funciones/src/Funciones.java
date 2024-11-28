public class Funciones {

    //Una función es una acción
    static void saludarDesdeJava(String mensaje){
        System.out.println("mensaje = " + mensaje);
    }

    public static void main(String[] args) {

        saludarDesdeJava("Hola, desde Java");
        saludarDesdeJava("Adios!!");
    }
}
