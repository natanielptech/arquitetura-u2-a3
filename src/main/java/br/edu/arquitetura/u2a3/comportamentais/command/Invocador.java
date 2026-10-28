package br.edu.arquitetura.u2a3.comportamentais.command;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Objects;

public final class Invocador {
    private final Deque<Comando> historico = new ArrayDeque<>();

    public void executar(Comando comando) {
        Objects.requireNonNull(comando).executar();
        historico.push(comando);
    }

    public boolean desfazerUltimo() {
        if (historico.isEmpty()) return false;
        historico.pop().desfazer();
        return true;
    }
}
