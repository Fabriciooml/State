
public class PedidoEstadoEfetuado extends PedidoEstado {

    private PedidoEstadoEfetuado() {};
    private static PedidoEstadoEfetuado instance = new PedidoEstadoEfetuado();
    public static PedidoEstadoEfetuado getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Efetuado";
    }
    
    public boolean fazer(Pedido pedido) {
        pedido.setEstado(PedidoEstadoFeito.getInstance());
        return true;
    }
    
    public boolean entregar(Pedido pedido) {
        pedido.setEstado(PedidoEstadoEntregue.getInstance());
        return true;
    }
    
    public boolean cancelar(Pedido pedido) {
        pedido.setEstado(PedidoEstadoCancelado.getInstance());
        return true;
    }

}
