public class PrecedenciaOperadores {
    public static void main(String[] args) {
        /* Precedencia de Operadores en Java
        Significado: Orden o prioridad con que se van a aplicar los operadores.
        Los operadores con el mismo rango, se aplica primero el que esté de izquierda a derecha.
        1.-Paréntesis y Corchetes (), []
        2.-Operadores unarios -, ++, --
        3.-Operadores aritméticos *, / y %
        4.-Operadores aritmétios + y -
        5.-Relacionales <, <=, >, >=
        6.-Equivalencia == y !=
        7.-Lógicos && y ||
        8.-Asignación =, +=, -=, *=, /=, %=, etc
         */

        //Expresión
        //Paso 1. Operación dentro del paréntesis (los operadores dentro siguen el mismo principio de gerarquías y de izq -->> der): (3-1) = 2
        //Paso 2. División: 12/3 = 4
        //Paso 3. Multiplicación: 2*2 = 4
        //Paso 4. Suma: 4+4 = 8
        var a = 12 / 3 + 2 * (3 - 1);

        System.out.println("a = " + a);



    }
}
