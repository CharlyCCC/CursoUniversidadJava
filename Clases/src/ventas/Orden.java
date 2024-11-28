package ventas;

public class Orden {
    private final int idOrden;
    private Producto[] productos;
    private int contadorProductos;
    private static final int MAX_PRODUCTOS = 10;
    private static int contadorOrdenes;

    public Orden(){
        this.idOrden = ++Orden.contadorOrdenes;
        this.productos = new Producto[Orden.MAX_PRODUCTOS];
    }

    public void agregarProducto(Producto producto){
        if (this.contadorProductos < MAX_PRODUCTOS){
        this.productos[this.contadorProductos++] = producto;
        }else {
            System.out.println("Se ha superado el número de productos: "
                    + Orden.MAX_PRODUCTOS);
        }
    }

    public double calcularTotal(){
        double total = 0;
        for (int i=0;i< contadorProductos;i++){
            var producto = this.productos[i];
            total += producto.getPrecio();
        }
        return total;
    }
/*
    public void mostrarOrden(){
        System.out.println("ID Orden: "+ this.idOrden);
        var totalOrden = this.calcularTotal();
        System.out.println("\tTotal de la orden: $" +totalOrden);
        System.out.println("\tProductos de la orden: ");
        for(int i=0;i < this.contadorProductos;i++){
            System.out.println("\t\t" + this.productos[i]);
        }
    }
 */

    @Override
    public String toString(){
        var resultado = "ID Orden: "+ this.idOrden + "\n";
        var totalOrden = this.calcularTotal();
        resultado += "\tTotal de la orden: $" +totalOrden + "\n";
        resultado +="\tProductos de la orden: \n";
        for(int i=0;i < this.contadorProductos;i++) {
            resultado += "\t\t" + this.productos[i] + "\n";
        }
        return resultado;
    }
}