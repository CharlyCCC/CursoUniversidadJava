package animales;

public class Animal {
    protected void hacerSonido(){
        System.out.println("El animal hace un sonido");
    }
}


class Perro extends Animal{
    @Override
    protected void hacerSonido(){
        System.out.println("El perro hace wauf!");
    }
}

/*

//Esta clase hija 'Perro' tiene error con el '@Override' por causa desconocida aún.
class Perro extends Animal{
    @Override
    protected void hacerSonindo(){
        System.out.println("El perro hace wauf!");
    }
}

 */

 class Gato extends Animal{
   @Override
     protected void hacerSonido(){
        System.out.println("El gato hace miau!");
    }
 }


 class PruebaAnimal{

    //Método polimófico: Recibe un dato 'genérico' de la clase padre, pero puede recibir objetos de las clases hijas.
    static void imprimirSonido(Animal animal){
        animal.hacerSonido();

     }

     public static void main(String[] args) {
        //Objeto de la clase Padre (Animal)
        var animal = new Animal();
        var animal1 = new Perro();
        var animal2 = new Gato();
        imprimirSonido(animal);
        imprimirSonido(animal1);
        imprimirSonido(animal2);

     }
 }
