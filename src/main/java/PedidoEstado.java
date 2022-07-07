
public abstract class PedidoEstado {
    
    public abstract String getEstado();

    public boolean efetuar(Pedido pedido) {
        return false;
    }

    public boolean fazer(Pedido pedido) {
        return false;
    }

    public boolean entregar(Pedido pedido) {
        return false;
    }

    public boolean cancelar(Pedido pedido) {
        return false;
    }
    
}
