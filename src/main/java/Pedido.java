
public class Pedido {
    
    private String nome;
    private PedidoEstado estado;

    public Pedido() {
        this.estado = PedidoEstadoEfetuado.getInstance();
    }
    
    public boolean efetuar() {
        return estado.efetuar(this);
    }
    
    public boolean fazer() {
        return estado.fazer(this);
    }
    
    public boolean entregar() {
        return estado.entregar(this);
    }
    
    public boolean cancelar() {
        return estado.cancelar(this);
    }

    public PedidoEstado getEstado() {
        return estado;
    }

    public void setEstado(PedidoEstado estado) {
        this.estado = estado;
    }

}
