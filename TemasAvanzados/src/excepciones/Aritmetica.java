package excepciones;

public class Aritmetica {
    public static int division(int numerado, int denominador){
        if (denominador == 0)
            throw new RuntimeException("División entre 0");
        return numerado/denominador;
    }
}
