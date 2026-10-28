package br.edu.arquitetura.u2a3.estruturais.adapter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AdaptadorFreteExternoTest {
    @Test
    void adaptaAChamadaParaBibliotecaExterna() {
        CalculadoraFrete calculadora = new AdaptadorFreteExterno((origem, destino, peso) -> peso * 2);
        assertEquals(6.0, calculadora.calcular("01000", "02000", 3));
    }
}
