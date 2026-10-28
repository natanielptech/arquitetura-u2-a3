package br.edu.arquitetura.u2a3.comportamentais.command;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class InvocadorTest {
    @Test
    void executaComandoEDesfazUltimo() {
        var servico = new CriarPedidoCmd.PedidoService();
        var invocador = new Invocador();
        invocador.executar(new CriarPedidoCmd(servico, "P-1"));
        assertTrue(servico.existe("P-1"));
        assertTrue(invocador.desfazerUltimo());
        assertFalse(servico.existe("P-1"));
        assertFalse(invocador.desfazerUltimo());
    }
}
