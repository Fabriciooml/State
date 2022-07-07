import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PedidoTest {

    Pedido pedido;

    @BeforeEach
    public void setUp() {
        pedido = new Pedido();
    }

    // Pedido efetuado

    @Test
    public void naoDeveEfetuarPedidoEfetuado() {
        pedido.setEstado(PedidoEstadoEfetuado.getInstance());
        assertFalse(pedido.efetuar());
    }

    @Test
    public void deveFazerPedidoEfetuado() {
        pedido.setEstado(PedidoEstadoEfetuado.getInstance());
        assertTrue(pedido.fazer());
        assertEquals(PedidoEstadoFeito.getInstance(), pedido.getEstado());
    }

    @Test
    public void deveEntregarPedidoEfetuado() {
        pedido.setEstado(PedidoEstadoEfetuado.getInstance());
        assertTrue(pedido.entregar());
        assertEquals(PedidoEstadoEntregue.getInstance(), pedido.getEstado());
    }

    @Test
    public void deveCancelarPedidoEfetuado() {
        pedido.setEstado(PedidoEstadoEfetuado.getInstance());
        assertTrue(pedido.cancelar());
        assertEquals(PedidoEstadoCancelado.getInstance(), pedido.getEstado());
    }

    // Pedido feito

    @Test
    public void naoDeveEfetuarPedidoFeito() {
        pedido.setEstado(PedidoEstadoFeito.getInstance());
        assertFalse(pedido.efetuar());
    }

    @Test
    public void naoDeveFazerPedidoFeito() {
        pedido.setEstado(PedidoEstadoFeito.getInstance());
        assertFalse(pedido.fazer());
    }

    @Test
    public void deveEntregarPedidoFeito() {
        pedido.setEstado(PedidoEstadoFeito.getInstance());
        assertTrue(pedido.entregar());
        assertEquals(PedidoEstadoEntregue.getInstance(), pedido.getEstado());
    }

    @Test
    public void deveCancelarPedidoFeito() {
        pedido.setEstado(PedidoEstadoFeito.getInstance());
        assertTrue(pedido.cancelar());
        assertEquals(PedidoEstadoCancelado.getInstance(), pedido.getEstado());
    }

    // Pedido entregue

    @Test
    public void naoDeveEfetuarPedidoEntregue() {
        pedido.setEstado(PedidoEstadoEntregue.getInstance());
        assertFalse(pedido.efetuar());
    }

    @Test
    public void naoDeveFazerPedidoEntregue() {
        pedido.setEstado(PedidoEstadoEntregue.getInstance());
        assertFalse(pedido.fazer());
    }

    @Test
    public void naoDeveEntregarPedidoEntregue() {
        pedido.setEstado(PedidoEstadoEntregue.getInstance());
        assertFalse(pedido.entregar());
    }

    @Test
    public void naoDeveCancelarPedidoEntregue() {
        pedido.setEstado(PedidoEstadoEntregue.getInstance());
        assertFalse(pedido.cancelar());
    }

    // Pedido Cancelado

    @Test
    public void naoDeveEfetuarPedidoCancelado() {
        pedido.setEstado(PedidoEstadoCancelado.getInstance());
        assertFalse(pedido.efetuar());
    }

    @Test
    public void naoDeveFazerPedidoCancelado() {
        pedido.setEstado(PedidoEstadoCancelado.getInstance());
        assertFalse(pedido.fazer());
    }

    @Test
    public void naoDeveEntregarPedidoCancelado() {
        pedido.setEstado(PedidoEstadoCancelado.getInstance());
        assertFalse(pedido.entregar());
    }

    @Test
    public void naoDeveCancelarPedidoCancelado() {
        pedido.setEstado(PedidoEstadoCancelado.getInstance());
        assertFalse(pedido.cancelar());
    }

}