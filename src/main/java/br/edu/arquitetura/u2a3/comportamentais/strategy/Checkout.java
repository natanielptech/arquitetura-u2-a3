package br.edu.arquitetura.u2a3.comportamentais.strategy;

import java.util.Objects;

public final class Checkout {
    private final EstrategiaFrete estrategia;

    public Checkout(EstrategiaFrete estrategia) {
        this.estrategia = Objects.requireNonNull(estrategia);
    }

    public double total(double valorPedido) {
        if (valorPedido < 0) throw new IllegalArgumentException("valor do pedido nao pode ser negativo");
        return valorPedido + estrategia.calcular(valorPedido);
    }
}
