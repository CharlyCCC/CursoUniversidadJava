import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Listas {
    public static void main(String[] args) {
        List<String> miLista = new ArrayList<>();
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
        miLista.add("Sabado");
        miLista.add("Domingo");

/*
        for (String elemento:miLista){
            System.out.println("Dia de la semana: "+ elemento);
        }
*/
/*
        //Funciones Lambda (función anónima de un código muy compacto) también llamado programación funcional
        miLista.forEach( elemento -> {
            System.out.println("Elemento: " + elemento);
        } );
 */

        miLista.forEach(System.out::println);
        System.out.println("");
        List<String> nombres = Arrays.asList("Pedro","Ivonne","Nohemi");
        nombres.forEach(System.out::println);

        System.out.println("");
        //Remover elemento
        miLista.remove("Domingo");
        miLista.forEach(System.out::println);
    }
}