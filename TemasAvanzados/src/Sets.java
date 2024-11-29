import java.util.TreeSet;
import java.util.Set;
public class Sets {
    public static void main(String[] args) {
        //Colecciones SET no mantienen el orden de los elementos por default y no admite elementos reperidos, ya que al imprimir, sólo los imprimirá una vez.
        Set<String> conjunto = new TreeSet<>();
        conjunto.add("Carlos");
        conjunto.add("Carlos");
        conjunto.add("Karla");
        conjunto.add("Victoria");

        System.out.println("Elementos del Set: ");
        conjunto.forEach(System.out::println);


        System.out.println("");
        //Remover elemento
        conjunto.remove("Karla");
        System.out.println("\nNuevos elementos del Set: ");
        conjunto.forEach(System.out::println);


    }
}
