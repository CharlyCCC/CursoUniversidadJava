package excepciones;

public class PruebaAritmetica {
    public static void main(String[] args) {
        try {
            int resultado = Aritmetica.division(10, 0);
            System.out.println("resultado = " + resultado);
        }catch (Exception e){
            System.out.println("Se intentó dividir entre 0 " + e);
        }
        finally{
            System.out.println("Se revisó la división entre 0");
        }
    }
}
