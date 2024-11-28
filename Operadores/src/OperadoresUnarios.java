public class OperadoresUnarios {
    public static void main(String[] args) {
        System.out.println("*** Operadores Unarios ***");
        int a = 3, b = 2, resultado = 0;
        var c = true;

        //Operador unario + (positivo)
        resultado= +a;
        System.out.println("resultado = " + resultado);

        //Operador unario - (negativo)
        resultado = -a;
        System.out.println("resultado = " + resultado);

        //Operador unario de incremento (++)
        a = 3;
        resultado = ++a; //Aplicando el principio de preincremento (primero se incrementa el valor)
        System.out.println("resultado = " + resultado);
        System.out.println("El valor de a ya se incrementó = " + a);

        //Post-Incremento
        a = 3;
        resultado =  a++; //Primero se usa el valor y después se incrementa
        System.out.println("resultado = " + resultado);
        System.out.println("a = " + a);


        //Pre-Decremento
        b = -2;
        resultado = --b;
        System.out.println("resultado = " + resultado);
        System.out.println("b ya se decrementó = " + b);

        //Post-Decremento
        b = -2;
        resultado = b--;
        System.out.println("resultado = " + resultado);
        System.out.println("b = " + b);

    }
}
