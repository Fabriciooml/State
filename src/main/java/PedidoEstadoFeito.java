
public class PedidoEstadoFeito extends PedidoEstado {

    private PedidoEstadoFeito() {};
    private static PedidoEstadoFeito instance = new PedidoEstadoFeito();
    public static PedidoEstadoFeito getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Feito";
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
