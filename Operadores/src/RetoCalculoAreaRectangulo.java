import java.util.Scanner;

public class RetoCalculoAreaRectangulo {
    public static void main(String[] args) {
        System.out.println("*** Calcular el área de un rectángulo ***");
        Scanner consola = new Scanner(System.in);
        double base;
        double altura;


        System.out.print("Ingrese el valor de la base: ");
        base = consola.nextDouble();
        System.out.print("Ingrese el valor de la altura: ");
        altura = consola.nextDouble();

        double area = base * altura;
        double perimetro = 2 * (base + altura);
        System.out.println("perimetro rectángulo = " + perimetro);
        System.out.println("area rectángulo = " + area);

    }
}
