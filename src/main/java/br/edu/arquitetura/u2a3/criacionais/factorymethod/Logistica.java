package br.edu.arquitetura.u2a3.criacionais.factorymethod;

public abstract class Logistica {
    public String planejarEntrega() {
        return criarTransporte().entregar();
    }

    protected abstract Transporte criarTransporte();

    public interface Transporte {
        String entregar();
    }

    public static final class LogisticaRodoviaria extends Logistica {
        @Override
        protected Transporte criarTransporte() {
            return () -> "Entrega por caminhao";
        }
    }

    public static final class LogisticaAerea extends Logistica {
        @Override
        protected Transporte criarTransporte() {
            return () -> "Entrega por aviao";
        }
    }
}
