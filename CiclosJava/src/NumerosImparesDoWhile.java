public class NumerosImparesDoWhile {
    public static void main(String[] args) {
        int contador = 0;

        do {
            if(contador % 2 != 0){
                System.out.print(contador + " ");
            }
            contador++;
        }while (contador <= 20);
    }
}
