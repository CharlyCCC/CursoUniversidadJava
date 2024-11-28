import java.util.Scanner;

public class EjercicioDescuentosVip {
    public static void main(String[] args) {
        System.out.println("*** Sistema de descuentos VIP ***");
        Scanner consola = new Scanner(System.in);

        final int NUMERO_PRODUCTOS_DESCUENTO = 10;
        System.out.print("¿Cuántos productos compró?: ");
        var cantidadProductos = Integer.parseInt(consola.nextLine());
        System.out.print("¿Es miembro?: (true/false)");
        boolean esMiembro = Boolean.parseBoolean(consola.nextLine());

        var esElegibleDescuento = cantidadProductos >= NUMERO_PRODUCTOS_DESCUENTO && esMiembro == true;
        System.out.println("¿Es Elegible para Descuento?: " + esElegibleDescuento);





    }
}
