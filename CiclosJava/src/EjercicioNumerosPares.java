public class EjercicioNumerosPares {
    public static void main(String[] args) {
        System.out.println("*** Numeros Pares - Ciclo While");

        int contador = 1;

        while (contador <= 20) {
            if (contador % 2 == 0){
                System.out.print(contador + " ");
            }
           contador++;
        }
    }
}
