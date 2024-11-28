import java.util.Random;

public class NumerosAleatorios {
    public static void main(String[] args) {
        Random random = new Random();


        //Generar número aleatorio entre 0 y 9
        var numeroEntre0y9 = random.nextInt(10);
        System.out.println("numeroEntre0y9 = " + numeroEntre0y9);


        //Generar número aleatorio entre 1 y 10
        var numeroEntre1y10 = random.nextInt(10)+1;
        System.out.println("numeroEntre1y10 = " + numeroEntre1y10);


        //Generar número flotante aleatorio entre 0.0 y 1.0
        var flotanteAleatorio = random.nextFloat();
        System.out.println("flotanteAleatorio = " + flotanteAleatorio);

        //Simular lanzamiento de un dado (Rango 1-6)
        int dado = random.nextInt(6)+1;
        int dado2 = random.nextInt(6)+1;
        System.out.println("dado = " + dado);
        System.out.println("dado2 = " + dado2);
    }
}
