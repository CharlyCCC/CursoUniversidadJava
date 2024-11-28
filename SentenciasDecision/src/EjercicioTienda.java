import java.util.Scanner;

public class EjercicioTienda {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.println("*** Tienda En Línea ***");

        //boolean esMiembro;
        //double montoTotal;

        System.out.print("Ingrese el total de su compra: ");
        double montoTotal = consola.nextDouble();
        System.out.print("¿Tiene membresía?: (true/false)");
        boolean esMiembro = consola.nextBoolean();
        final double DESCUENTO_10 = 0.10;
        final double DESCUENTO_5 = 0.05;
        final double MONTO_LIMITE = 1000;
        double totalFinal;
        double descuento;

        if (esMiembro && montoTotal >= 1000){
            descuento = (montoTotal * DESCUENTO_10);
            totalFinal = montoTotal - descuento;

            System.out.printf("""
                    Usted cuenta con un descuento del 10%% del total de su compra.
                    
                    Desglose:
                    \t Subtotal: $%.2f
                    \t Descuento aplicado: 10%%
                    \t Total descuento: %.2f
                    \t Total: $%.2f
                    """,montoTotal,descuento,totalFinal);

        } else if (esMiembro && montoTotal < 1000) {
            descuento = (montoTotal * DESCUENTO_5);
            totalFinal = montoTotal - descuento;

            System.out.printf("""
                    Usted cuenta con un descuento del 5%% del total de su compra.
                    
                    Desglose:
                    \t Subtotal: $%.2f
                    \t Descuento aplicado:  5%%
                    \t Total descuento: %.2f
                    \t Total: $%.2f
                    """,montoTotal,descuento,totalFinal);
        }else if (!esMiembro && montoTotal >= MONTO_LIMITE){
            System.out.printf("""
                    Gracias por gastar con nosotros, pero por no ser miembro, se lleva miembro de descuento.
                    
                    Desglose:
                    \t Subtotal: $%.2f
                    \t Descuento aplicado: 0%%
                    \t Total: $%.2f
                    """,montoTotal,montoTotal);
        }else {
            System.out.printf("""
                    Usted no cumple con los requisitos para algún descuento
                    
                    Desglose:
                    \t Subtotal: $%.2f
                    \t Descuento aplicado: 0%%
                    \t Total: $%.2f
                    """,montoTotal,montoTotal);
        }

    }
}
