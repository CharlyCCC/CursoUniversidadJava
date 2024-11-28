public class TiposDatos {
    public static void main(String[] args) {
        //Tipos de datos en Java
        //Enteros (Valor default es 0)
        byte tipoByte = 127;
        System.out.println("tipoByte = " + tipoByte);

        short tipoShort = 32000;
        //Se puede hacer una conversiona short, pero no es recomendable
        //short tipoShort = (short) 32000;
        System.out.println("tipoShort = " + tipoShort);

        int tipoInt = 2147483647;
        System.out.println("tipoInt = " + tipoInt);

        long tipoLong = 987654321098765432L; //L o l para indicar tipo long
        System.out.println("tipoLong = " + tipoLong);

        //Tipos flotantes (Valor default es 0.0)
        float tipoFloat = 3.14F; //F o f al final para indicar tipo float
        System.out.println("tipoFloat = " + tipoFloat);

        double tipoDoble = 3.1315; //Opcional se agrea una D o d para indicar tipo double
        System.out.println("tipoDoble = " + tipoDoble);

        //Caracter (Valor default '\u0000' que equivale a 0 en Unicode)
        char tipoChar = 'A'; //Caracteres de tipo Unicode
        System.out.println("tipoChar = " + tipoChar);
        tipoChar = 65; //Conversion al valor equivalente en el juego de caracteres Unicode
        System.out.println("tipoChar = " + tipoChar);
        tipoChar = '@';
        System.out.println("tipoChar = " + tipoChar);

        //Booleano (Valor default 'false')
        boolean tipoBoolean = true;
        System.out.println("tipoBoolean = " + tipoBoolean);
        tipoBoolean = false;

        //Tipos Object (Referencia)
        //String (Valor default = null)
        String nombre = null;
        System.out.println("nombre = " + nombre);
        nombre = "Charly";
        System.out.println("nombre = " + nombre);

    }
}
