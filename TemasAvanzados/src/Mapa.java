import java.util.HashMap;
import java.util.Map;

public class Mapa {
    public static void main(String[] args) {
        Map<String, String> persona = new HashMap<>();
        persona.put("nombre", "Diego");
        persona.put("apellido", "Flores");
        persona.put("edad", "31");

        System.out.println("Valores del mapa/diccionario: ");
        persona.entrySet().forEach(System.out::println);
//Modificar valores preexistentes
        persona.put("edad", "35");
        System.out.println("Nuevos valores: ");
        persona.entrySet().forEach(System.out::println);


        //Eliminar datos
        persona.remove("apellido");
        System.out.println("Eliminando valores: ");
        persona.entrySet().forEach(System.out::println);

        //Iterar sobre los elementos del mapa por separado
        System.out.println("\n Iterando los elementos (llave/valor)");
        persona.forEach((llave, valor) -> {
            System.out.println("Llave: " + llave + ", Valor: " + valor);
        });
    }
}
