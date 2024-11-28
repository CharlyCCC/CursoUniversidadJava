public class FuncionRecursiva {

    //Imprimir valores del 1-5 usando funcion recursiva
    //funcion recursiva
    static void funcionRecursiva(int numero){
        //caso base
        if (numero == 1){
            System.out.print(numero + " ");
        }else{
            //Caso recursivo

            //System.out.print(numero + " "); //Para imprimir en orden descendente
            funcionRecursiva(numero-1);
            //System.out.print(numero + " "); //Para imprimir en orden ascendente
        }

    }
    public static void main(String[] args) {
        funcionRecursiva(5);
    }
}
