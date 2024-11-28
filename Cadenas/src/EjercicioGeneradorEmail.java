public class EjercicioGeneradorEmail {
    public static void main(String[] args) {
        System.out.println("*** Generador Emails ***");
        var nombre = " Carlos Sanchez Castaneda ".trim().toLowerCase().replace(' ','.');
        var empresa = " Protecting All ".strip().toLowerCase();
        var dominio = ".com.mx";



        var email = (nombre+"@"+empresa+dominio).replace(" ",".").toString();
        System.out.println("email = " + email);
        
    }
}
