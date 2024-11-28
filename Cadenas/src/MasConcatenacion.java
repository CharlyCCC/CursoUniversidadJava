public class MasConcatenacion {
    public static void main(String[] args) {
        //Ms formas de concatenar cadenas en Java
        String cadena1 = "Hola";
        var cadena2 = "Mundo";
        System.out.println(cadena1 +" "+ cadena2);
        System.out.println(" ");
        //o también así:
        var cadena3 = cadena1 +" "+ cadena2;
        System.out.println("cadena 3 usando + = " + cadena3);

        //Método concat
        cadena3 = cadena1.concat(" ").concat("Mundo");
        System.out.println("cadena3 = " + cadena3);
        System.out.println(" ");

        //StringBuilder
        var constructorCadenas = new StringBuilder();
        constructorCadenas.append(cadena1);
        constructorCadenas.append(" ");
        constructorCadenas.append(cadena2);
        var resultado = constructorCadenas.toString();
        System.out.println("resultado StringBuilder= " + resultado);
        System.out.println(" ");


        //StringBuffer
        var stringBuffer = new StringBuffer();
        stringBuffer.append(cadena1).append(" ").append(cadena2);
        System.out.println("stringBuffer = " + stringBuffer);
        resultado = stringBuffer.toString();
        System.out.println("resultado StringBuffer= " + resultado);
        System.out.println(" ");

        // Join
        resultado = String.join("_ _",cadena1,cadena2,"Adios!");
        System.out.println("resultado join= " + resultado);

    }
}
