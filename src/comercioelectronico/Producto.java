package comercioelectronico;
// Es la super clase: hereda sus atributos y sus metodos a las sub clases
public class Producto {
    private String idProducto;
    private String nombre;
    private Double precio;

    public Producto() {
    }

    public Producto(String idProducto, String nombre, Double precio) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(String idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }
    
    public Double calcularDescuento(Double descuento){
        
        return this.precio * (1 - descuento);
    }
}
