public class OperadoresAsignacion {
    public static void main(String[] args) {

        //Asignación =
        var miNumero = 1;
        int miNumero2;
        miNumero2 = 4;

        //Asignación compuesto
        // +=
        miNumero += 5; //miNumero = miNumero + 5;
        System.out.println("miNumero = " + miNumero);

        // -=
        miNumero -= 5; //miNumero = miNumero - 5;
        System.out.println("miNumero = " + miNumero);

        // *=
        miNumero -= 5; //miNumero = miNumero * 5;

        // "/="
        miNumero /= 5; // miNumero = miNumero / 5;
        System.out.println("miNumero = " + miNumero);


        // %=
        miNumero %= 5; // miNumero = miNumero % 5;
        System.out.println("miNumero = " + miNumero);

        //Asignación de variables múltiples
        //En la asignación múltiple no se puede usar var
        int a = 10, b = 5, c = 15;
        System.out.printf("a = %d, b = %d, c = %d",a,b,c);





    }
}
