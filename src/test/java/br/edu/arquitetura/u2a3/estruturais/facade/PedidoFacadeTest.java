package br.edu.arquitetura.u2a3.estruturais.facade;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PedidoFacadeTest {
    @Test
    void coordenaSubsistemasNaOrdemEsperada() {
        var chamadas = new ArrayList<String>();
        var facade = new PedidoFacade(
                pedido -> chamadas.add("validar"),
                pedido -> { chamadas.add("frete"); return 5; },
                pedido -> chamadas.add("estoque"),
                (pedido, frete) -> chamadas.add("cobrar:" + frete));
        assertEquals("Pedido finalizado", facade.finalizarPedido("P-1"));
        assertEquals(java.util.List.of("validar", "frete", "estoque", "cobrar:5.0"), chamadas);
    }
}
