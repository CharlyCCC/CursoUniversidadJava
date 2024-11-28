public class ArgumentosVariables {
    public static void main(String[] args) {
        //imprimirNumeros(1,2,3,4,5);//var args -->> argumentos variables
        variosParametros("Karla",10,20, 30);
    }

    static void variosParametros(String nombre, int numero1, int... numeros) {

        System.out.println("nombre = " + nombre);
        imprimirNumeros(numero1);
        System.out.println();
        imprimirNumeros(numeros);
    }


    static void imprimirNumeros(int... numeros) {
        for (int i=0;i<numeros.length;i++){
            System.out.print(numeros[i]+ " ");
        }
    }
}
