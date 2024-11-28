import java.util.TreeSet;
import java.util.Set;
public class Sets {
    public static void main(String[] args) {
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
        conjunto.forEach(System.out::println);


    }
}
