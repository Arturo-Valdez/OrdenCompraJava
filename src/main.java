import ventas.OrdenCompra;
import ventas.Producto;

public class main {
    public static void main(String[] args) {
        //Titulo
        System.out.println("*** Punto de Venta ***");

        //Productos creados
        var producto1 = new Producto("Blusa", 140.12);
        var producto2 = new Producto("Pantalon", 299.12);
        var producto3 = new Producto("Gorra", 50.00);
        var producto4 = new Producto("tines", 10.20);
        var producto5 = new Producto("Zapatos", 1540.50);
        var producto6 = new Producto("Lentes", 230.40);
        var producto7 = new Producto("Guantes", 23.00);

        //Orden de compra
        var orden1 = new OrdenCompra();

        //Agregar productos
        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto3);
        orden1.agregarProducto(producto7);
        orden1.agregarProducto(producto5);

        //Mostrar orden de compra
        System.out.println(orden1);


    }
}
