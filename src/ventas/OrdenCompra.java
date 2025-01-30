package ventas;

import java.util.Arrays;

public class OrdenCompra {
    private final int idOrden;
    private Producto[] productos;
    private int contarProducto;
    private static final int MAX_PRODUCTOS =10;
    private static int contadorOrden;

    public OrdenCompra() {
        this.productos = new Producto[OrdenCompra.MAX_PRODUCTOS];
        this.idOrden = ++OrdenCompra.contadorOrden;
    }

    public void agregarProducto(Producto producto){
        if(this.contarProducto < MAX_PRODUCTOS)
            this.productos[this.contarProducto++] = producto;
        else
            System.out.println("Se ha superado el maximo de Productos: " + MAX_PRODUCTOS);
    }

    public double calcularTotal(){
        double total = 0;
        for (int i = 0; i < this.contarProducto; i++) {
            var productos = this.productos[i];
            total += productos.getPrecioProducto();
        }
        return total;
    }

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
