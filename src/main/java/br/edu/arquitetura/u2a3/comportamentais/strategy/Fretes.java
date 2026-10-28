package br.edu.arquitetura.u2a3.comportamentais.strategy;

public final class Fretes {
    private Fretes() {}

    public static final class Expresso implements EstrategiaFrete {
        public double calcular(double valorPedido) { return 25.0; }
    }

    public static final class Economico implements EstrategiaFrete {
        public double calcular(double valorPedido) { return 10.0; }
    }

    public static final class Retirada implements EstrategiaFrete {
        public double calcular(double valorPedido) { return 0.0; }
    }
}
