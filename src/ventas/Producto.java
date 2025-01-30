package ventas;

public class Producto {
    //atributos
    private final int idProducto;
    private String nombreProducto;
    private double precioProducto;
    private static int contadorProducto;

    //Constructor
    public Producto(String nombreProducto, double precioProducto){
        this.idProducto = ++Producto.contadorProducto;
        this.nombreProducto = nombreProducto;
        this.precioProducto = precioProducto;
    }

    //Imprecion de producto
    @Override
    public String toString() {
        return "Producto{" +
                "idProducto=" + idProducto +
                ", nombreProducto='" + nombreProducto + '\'' +
                ", precioProducto=" + precioProducto +
                '}';
    }

    public int getIdProducto() {
        return idProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public double getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(double precioProducto) {
        this.precioProducto = precioProducto;
    }
}
