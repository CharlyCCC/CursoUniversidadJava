public class ConcatenacionCadenas {
    public static void main(String[] args) {
        System.out.println("*** Concatenacion de Cadenas ***");
        var nombre = "Alexa";
        var apellido = "Cruz";
        var nombreCompleto = nombre + apellido;
        System.out.println("nombreCompleto = " + nombreCompleto);
        nombreCompleto = nombre + " " +apellido;
        System.out.println("nombreCompleto = " + nombreCompleto);

    }
}
