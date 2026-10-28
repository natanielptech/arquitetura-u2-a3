package br.edu.arquitetura.u2a3.criacionais.builder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ProdutoTest {
    @Test
    void constroiProdutoComOpcoes() {
        Produto produto = new Produto.Builder().definirCor("azul").definirTamanho(3)
                .adicionarAcessorio("estojo").construir();
        assertEquals("azul", produto.cor());
        assertEquals(3, produto.tamanho());
        assertEquals(java.util.List.of("estojo"), produto.acessorios());
    }

    @Test
    void rejeitaTamanhoInvalido() {
        assertThrows(IllegalArgumentException.class, () -> new Produto.Builder().definirTamanho(0));
    }
}
