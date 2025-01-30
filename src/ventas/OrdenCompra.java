package ventas;

//Clase orden de compra
public class OrdenCompra {
    //Atributos
    private final int idOrden;
    private Producto[] productos;
    private int contarProducto;
    private static final int MAX_PRODUCTOS =10;
    private static int contadorOrden;

    //Constructor con array de Productos y id Orden
    public OrdenCompra() {
        this.productos = new Producto[OrdenCompra.MAX_PRODUCTOS];
        this.idOrden = ++OrdenCompra.contadorOrden;
    }

    //Metodo vacio donde agrega los productos en memoria y con limite de
    //Productos almacenados en la Orden de compra
    public void agregarProducto(Producto producto){
        if(this.contarProducto < MAX_PRODUCTOS)
            this.productos[this.contarProducto++] = producto;
        else
            System.out.println("Se ha superado el maximo de Productos: " + MAX_PRODUCTOS);
    }

    //Suma de los precios a los productos seleccionados
    public double calcularTotal(){
        double total = 0;
        for (int i = 0; i < this.contarProducto; i++) {
            var productos = this.productos[i];
            total += productos.getPrecioProducto();
        }
        return total;
    }

    //Metodo toString para imprecion de Orden de compra
    @Override
    public String toString() {
        var resultado = "Id Orden: " + this.idOrden + "\n";
        var totalOrden = this.calcularTotal();
        resultado += "\tTotal de la orden: $" + totalOrden + "\n";
        resultado += "\tProductos de la orden: \n";
        for (int i = 0; i < this.contarProducto; i++) {
            resultado += "\t\t" + this.productos[i] + "\n";
        }
        return resultado;
    }
}
