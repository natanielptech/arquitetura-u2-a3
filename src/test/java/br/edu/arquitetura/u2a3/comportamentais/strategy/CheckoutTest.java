package br.edu.arquitetura.u2a3.comportamentais.strategy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CheckoutTest {
    @Test
    void estrategiaPodeSerTrocadaSemCondicionaisNoCheckout() {
        assertEquals(125.0, new Checkout(new Fretes.Expresso()).total(100));
        assertEquals(110.0, new Checkout(new Fretes.Economico()).total(100));
        assertEquals(100.0, new Checkout(new Fretes.Retirada()).total(100));
    }

    @Test
    void rejeitaValorNegativo() {
        assertThrows(IllegalArgumentException.class, () -> new Checkout(new Fretes.Retirada()).total(-1));
    }
}
