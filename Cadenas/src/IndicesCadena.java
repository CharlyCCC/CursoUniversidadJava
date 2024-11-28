public class IndicesCadena {
    public static void main(String[] args) {
        //Manejo de índices en una cadena
        var cadena1 = "Hola Mundo";


        //Recuperar el primer caracter
        var primerCaracter = cadena1.charAt(0); //Esto recupera el caracter "H"
        System.out.println("primerCaracter = " + primerCaracter);

        char ultimoCaracter = cadena1.charAt(9);
        System.out.println("ultimoCaracter = " + ultimoCaracter);

        char letraM = cadena1.charAt(5);
        System.out.println("letraM = " + letraM);


    }
}
