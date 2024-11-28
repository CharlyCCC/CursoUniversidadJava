package ventas;

public class PruebaVentas {
    public static void main(String[] args) {
        System.out.println("*** Sistema de Ventas ***");
        var producto1 = new Producto("Blusa", 30.00);
     //   System.out.println(producto1);
        var producto2 = new Producto("Zapatos", 50.00);
     //   System.out.println(producto2);

        //Primer objeto tipo Orden
        var orden1 = new Orden();
        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto2);
        System.out.println(orden1); //orden1.mostrarOrden(); -->> método reemplazado haciendo @Override al método toString


        //Segunda orden
        var orden2 = new Orden();
        orden2.agregarProducto(new Producto("Payera", 15.00)); //estos valores sólo son accesibles aquí y no pueden ser reutilizados en otros objetos de tipo orden
        orden2.agregarProducto(producto1);
        orden2.agregarProducto(producto2);
        System.out.println(orden2); //orden2.mostrarOrden(); -->> método reemplazado haciendo @Override al método toString

    }
}
