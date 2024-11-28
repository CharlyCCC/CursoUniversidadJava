public class FuncionSumar {
    //Definimos la función de sumar
    static int sumar(int a, int b){
        int resultado = a + b;
        return resultado;
    }

    public static void main(String[] args) {
        int argumento1 = 3;
        int argumento2 = 8;

        int resultado_funcion = sumar(argumento1,argumento2);

        System.out.println("resultado_funcion = " + resultado_funcion);
        resultado_funcion = sumar(10,20);
        System.out.println("resultado_funcion = " + resultado_funcion);
    }
}
