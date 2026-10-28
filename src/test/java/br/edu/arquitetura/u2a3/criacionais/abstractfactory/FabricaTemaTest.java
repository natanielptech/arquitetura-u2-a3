package br.edu.arquitetura.u2a3.criacionais.abstractfactory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FabricaTemaTest {
    @Test
    void fabricaCriaUmaFamiliaCoerente() {
        FabricaTema fabrica = new FabricaTema.FabricaEscuro();
        assertEquals("escuro", fabrica.criarBotao().tema());
        assertEquals("escuro", fabrica.criarCaixaTexto().tema());
        assertEquals("escuro", fabrica.criarMenu().tema());
    }
}
