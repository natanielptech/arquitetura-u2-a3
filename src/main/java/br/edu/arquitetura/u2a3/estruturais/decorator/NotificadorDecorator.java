package br.edu.arquitetura.u2a3.estruturais.decorator;

import java.util.Objects;

public abstract class NotificadorDecorator implements Notificador {
    protected final Notificador envolvido;

    protected NotificadorDecorator(Notificador envolvido) {
        this.envolvido = Objects.requireNonNull(envolvido);
    }
}
