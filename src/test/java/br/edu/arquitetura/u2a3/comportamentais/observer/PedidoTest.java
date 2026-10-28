package br.edu.arquitetura.u2a3.comportamentais.observer;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PedidoTest {
    @Test
    void notificaObservadoresRegistradosEPermiteRemocao() {
        Pedido pedido = new Pedido();
        var eventos = new ArrayList<Pedido.Status>();
        Pedido.Observador observador = atualizado -> eventos.add(atualizado.status());
        pedido.registrar(observador);
        pedido.mudarStatus(Pedido.Status.ENVIADO);
        pedido.remover(observador);
        pedido.mudarStatus(Pedido.Status.ENTREGUE);
        assertEquals(java.util.List.of(Pedido.Status.ENVIADO), eventos);
    }
}
