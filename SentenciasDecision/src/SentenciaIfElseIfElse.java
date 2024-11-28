public class SentenciaIfElseIfElse {
    public static void main(String[] args) {
        int edad = 16;
        if (edad >= 18){
            System.out.println("Mayor");
        } else if (edad >= 13 && edad < 18) {
            System.out.println("Adolecente");
            
        }else {
            System.out.println("Niño");
        }
    }
}
