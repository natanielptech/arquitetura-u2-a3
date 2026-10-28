package br.edu.arquitetura.u2a3.spring.observer;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
public class PublicadorPedido {
    private final ApplicationEventPublisher eventos;

    public PublicadorPedido(ApplicationEventPublisher eventos) {
        this.eventos = Objects.requireNonNull(eventos);
    }

    public void publicarStatus(String codigo, br.edu.arquitetura.u2a3.comportamentais.observer.Pedido.Status status) {
        eventos.publishEvent(new PedidoAlteradoEvent(codigo, status));
    }
}
