package comercioelectronico;

import java.util.ArrayList;

public class Cliente {

    private String idCliente;
    private String nombre;
    private ArrayList<Pedido> pedidosRealizados = new ArrayList<>();

    public Cliente() {
    }

    public Cliente(String idCliente, String nombre) {
        this.idCliente = idCliente;
        this.nombre = nombre;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Pedido> getPedidosRealizados() {
        return pedidosRealizados;
    }

    public void setPedidosRealizados(ArrayList<Pedido> pedidosRealizados) {
        this.pedidosRealizados = pedidosRealizados;
    }
    
    public void crearPedido(Pedido ped){
        this.pedidosRealizados.add(ped);
    }
}
