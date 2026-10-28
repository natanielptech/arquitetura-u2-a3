package br.edu.arquitetura.u2a3.criacionais.factorymethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LogisticaTest {
    @Test
    void subclassesEscolhemOTransporte() {
        assertEquals("Entrega por caminhao", new Logistica.LogisticaRodoviaria().planejarEntrega());
        assertEquals("Entrega por aviao", new Logistica.LogisticaAerea().planejarEntrega());
    }
}
