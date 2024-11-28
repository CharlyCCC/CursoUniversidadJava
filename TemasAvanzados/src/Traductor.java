public interface Traductor {
    //public abstract
    void traducir();

    //Métodos con implementación default
    default void iniciarTraductor(){
        System.out.println("Iniciando traductor...");
    }
}


class Ingles implements Traductor{
    @Override
    public void traducir(){
        System.out.println("Traduzco a Inglés");
    }
}

class Frances implements Traductor{
    @Override
    public void traducir(){
        System.out.println("Traduzco a Francés");
    }
    @Override
    public void iniciarTraductor(){
        System.out.println("Iniciando traductor en francés");
    }
}

class PruebaTraductor{
    public static void main(String[] args) {
        Traductor ingles = new Ingles();
        ingles.iniciarTraductor();
        ingles.traducir();
//Traductor en francés
        Traductor frances = new Frances();
        frances.iniciarTraductor();
        frances.traducir();
    }
}