import java.util.Scanner;

public class EjercicioTicketVenta {
    public static void main(String[] args) {
        System.out.println("*** Sistema de Generación de Ticket de Venta ***");

        Scanner consola = new Scanner(System.in);

        System.out.print("Precio del producto leche: ");
        double precioLeche = consola.nextDouble();
        System.out.print("Precio del Pan: ");
        double precioPan = consola.nextDouble();
        System.out.print("Precio de la lechuga: ");
        double precioLechuga = consola.nextDouble();
        System.out.print("Precio de los plátanos: ");
        double precioPlatano = consola.nextDouble();

        //Aplicación descuento
        System.out.print("¿Aplicar un descuento (%)?: ");
        var descuentoPorcentaje = consola.nextInt();


        //Cálculo del subtotal (antes de impuestos)
        var subTotal = precioLeche + precioPan + precioLechuga + precioPlatano;
        //System.out.printf("El subtotal es de: $%.2f", subTotal);

        //Aplicar descuento
        var descuento = subTotal * (descuentoPorcentaje/100.0);

        //Subtotal con descuento
        var subTotalConDescuento = subTotal - descuento;




        final double IVA = 0.16;
        var totalImpuesto = subTotalConDescuento * IVA;
        var totalFinal = totalImpuesto + subTotalConDescuento;

        //System.out.printf("%nSu total final es de: $%.2f", totalFinal);

        //Imprimir Ticket de Venta
        System.out.printf("""
                \n
                TICKET DE VENTA               
                Artículos:
                \tLeche:\t $%.2f
                \tPan:\t $%.2f
                \tLechuga: $%.2f
                \tPlátano: $%.2f
                
                Subtotal:\t\t $%.2f
                Descuento:\t $%.2f (%d%%)
                Impuestos(16%%):\t $%.2f
                
                \tTOTAL:\t\t $%.2f
                """,precioLeche,precioPan,precioLechuga,precioPlatano,subTotal,descuento, descuentoPorcentaje,totalImpuesto,totalFinal);
    }
}
