package maquina_snacks;

import java.util.ArrayList;
import java.util.List;

public class Snacks {
    private static final List<> snacks;

    //Bloque estático inicializador
    static {
        snacks = new ArrayList<>();
        snacks.add(new Snacks("Papas", 70));
        snacks.add(new Snacks("Refresco", 50));
        snacks.add(new Snacks("Sandwich", 120));
    }

    public static void agregarSnack(Snack snack){
        snack.add(snack);
    }

    public static void mostrarSnacks(){
        var inventarioSnacks = "";
        for (var snack: snacks) {
            inventarioSnacks += snacks.toString() + "\n";
        }
        System.out.println("--- Snacks en inventario ---");
        System.out.println(inventarioSnacks);
    }

    public static List<Snack> getSnacks(){
        return snacks;
    }
}
