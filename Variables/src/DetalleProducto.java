public class DetalleProducto {
    public static void main(String[] args) {
        String nombreProducto = "Catsup";
        double precio = 15.45;
        int cantidadDisponible = 10;
        boolean diponibleVenta = true;


        System.out.println("nombreProducto = " + nombreProducto);
        System.out.println("precio = " + precio);
        System.out.println("cantidadDisponible = " + cantidadDisponible);
        System.out.println("diponibleVenta = " + diponibleVenta);


        nombreProducto = "Ketchup";
        precio = 20.50;
        cantidadDisponible = 0;
        diponibleVenta = false;

        System.out.println(" ");
        System.out.println("nombreProducto = " + nombreProducto);
        System.out.println("precio = " + precio);
        System.out.println("cantidadDisponible = " + cantidadDisponible);
        System.out.println("diponibleVenta = " + diponibleVenta);
    }
}
