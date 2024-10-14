package comercioelectronico;

public class ComercioElectronico {

    public static void main(String[] args) {
        
        Cliente cliente1 = new Cliente("C1", "Ignacio González");
        Electronico elec1 = new Electronico("SAMSUNG", 6);
        Ropa ropa1 = new Ropa("XL", "AZUL");
        Electronico elec2 = new Electronico("APPLE", 24);
        
        elec1.setNombre("Galaxy S23");
        elec1.setPrecio(500000.0);
        elec1.setIdProducto("S101");
        
        ropa1.setNombre("Levis");
        ropa1.setIdProducto("L101");
        ropa1.setPrecio(80000.0);
        
        elec2.setIdProducto("A101");
        elec2.setPrecio(1000000.0);
        elec2.setNombre("Iphone 16");
        
        
        
        Pedido ped1 = new Pedido();
        ped1.agregarProducto(elec1);
        ped1.agregarProducto(ropa1);
        ped1.agregarProducto(elec2);
        
        cliente1.crearPedido(ped1);
        
        for(Pedido ped : cliente1.getPedidosRealizados()){
            for(Producto prod : ped.getProductos()){
                System.out.println(prod.getMarca());
            }
        }
        
    }
    
}
