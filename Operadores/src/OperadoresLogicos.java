public class OperadoresLogicos {
    public static void main(String[] args) {
        System.out.println("*** Operadores Lógicos ***");

        //Operador & (AND) -->> Regresa true si ambos valores son verdaderos
        System.out.println("*** Operador AND '&&' ***");
        boolean a = true, b = false;
        var resultado = a && b;
        System.out.println("resultado = " + resultado);

        //Operador || (OR) -->> Regresa true si cualquiera de los valores es verdadero
        System.out.println("*** Operador OR '||' ***");
        boolean c = true, d = false;

        resultado = c || d; //verdadero + falso = verdadero
        System.out.println("resultado = " + resultado);
        resultado = b || d; //falso + falso = falso
        System.out.println("resultado = " + resultado);


        //Operador '!' (NOT) -->> Operador unario que invierte el valor lógico de la variable
        System.out.println("*** Operador NOT ***");
        boolean e = false;

        resultado = !e;
        System.out.println("resultado = " + resultado);





    }
}
