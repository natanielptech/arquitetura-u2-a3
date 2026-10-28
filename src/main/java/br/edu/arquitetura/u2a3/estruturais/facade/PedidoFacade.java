package br.edu.arquitetura.u2a3.estruturais.facade;

import java.util.Objects;

public final class PedidoFacade {
    private final Validador validador;
    private final CalculadoraFrete frete;
    private final Estoque estoque;
    private final Cobranca cobranca;

    public PedidoFacade(Validador validador, CalculadoraFrete frete, Estoque estoque, Cobranca cobranca) {
        this.validador = Objects.requireNonNull(validador);
        this.frete = Objects.requireNonNull(frete);
        this.estoque = Objects.requireNonNull(estoque);
        this.cobranca = Objects.requireNonNull(cobranca);
    }

    public String finalizarPedido(String pedido) {
        validador.validar(pedido);
        double valorFrete = frete.calcular(pedido);
        estoque.reservar(pedido);
        cobranca.cobrar(pedido, valorFrete);
        return "Pedido finalizado";
    }

    @FunctionalInterface public interface Validador { void validar(String pedido); }
    @FunctionalInterface public interface CalculadoraFrete { double calcular(String pedido); }
    @FunctionalInterface public interface Estoque { void reservar(String pedido); }
    @FunctionalInterface public interface Cobranca { void cobrar(String pedido, double frete); }
}
