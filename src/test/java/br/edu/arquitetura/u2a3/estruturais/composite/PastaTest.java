package br.edu.arquitetura.u2a3.estruturais.composite;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PastaTest {
    @Test
    void calculaTamanhoRecursivoDeArquivosEPastas() {
        Pasta raiz = new Pasta();
        Pasta subpasta = new Pasta();
        subpasta.adicionar(new Arquivo(12));
        raiz.adicionar(new Arquivo(8));
        raiz.adicionar(subpasta);
        assertEquals(20, raiz.calcularTamanho());
    }
}
