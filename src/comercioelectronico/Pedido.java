package comercioelectronico;

import java.util.ArrayList;

public class Pedido {

    private ArrayList<Producto> productos = new ArrayList<>();
    private Double total;

    public Pedido() {
    }

    public Pedido(Double total) {
        this.total = total;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Double calcularTotal() {
        for (Producto prod : this.productos) {
            this.total += prod.getPrecio();
        }
        return this.total;
    }
    
    public void agregarProducto(Producto producto){
        // Este método recibe el objeto, pero no setea los atributos, porque de eso se encarga el constructor o el setter de la clase Producto
        this.productos.add(producto);
        System.out.println("Producto agregado exitosamente!");
    }

}
