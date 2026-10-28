package br.edu.arquitetura.u2a3.comportamentais.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public final class Pedido {
    private final List<Observador> observadores = new ArrayList<>();
    private Status status = Status.CRIADO;

    public void registrar(Observador observador) {
        observadores.add(Objects.requireNonNull(observador));
    }

    public void remover(Observador observador) {
        observadores.remove(observador);
    }

    public void mudarStatus(Status novoStatus) {
        status = Objects.requireNonNull(novoStatus);
        List.copyOf(observadores).forEach(observador -> observador.atualizar(this));
    }

    public Status status() {
        return status;
    }

    public enum Status { CRIADO, PAGO, ENVIADO, ENTREGUE }

    @FunctionalInterface
    public interface Observador {
        void atualizar(Pedido pedido);
    }
}
