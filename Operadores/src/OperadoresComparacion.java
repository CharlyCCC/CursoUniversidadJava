public class OperadoresComparacion {
    public static void main(String[] args) {
        System.out.println("*** También llamados como relacionales ***");

        int a = 10, b = 5;

        // Igualdad "=="
        var resultado = a == b;
        System.out.println("resultado = " + resultado);

        //Distinto "!="
        resultado = (a != b);
        System.out.println("resultado = " + resultado);


        //Mayor que >
        resultado = a>b;
        System.out.println("resultado = " + resultado);

        //Menos que <
        resultado = a<b;
        System.out.println("resultado = " + resultado);

        //Mayor o igual que >=
        resultado = a>=b;
        System.out.println("resultado = " + resultado);

        //Menos o igual que <=
        resultado = a<=b;
        System.out.println("resultado = " + resultado);

    }
}
