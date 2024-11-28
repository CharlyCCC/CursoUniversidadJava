public class DoWhileNumerosInversos {
    public static void main(String[] args) {
        int contador = 10;

        System.out.println("Con Ciclo Do-While");
        do {
            System.out.print(contador-- + " ");
        }while (contador > 0);


        System.out.println("\nCon Ciclo While");
        while (contador > 0){
            System.out.print(contador-- + " ");
        }
    }
}
