package br.edu.arquitetura.u2a3.spring.observer;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
public class ObservadorStatusPedido {
    private static final Logger LOGGER = Logger.getLogger(ObservadorStatusPedido.class.getName());

    @EventListener
    public void aoAlterarStatus(PedidoAlteradoEvent evento) {
        LOGGER.info(() -> "Pedido " + evento.codigo() + " alterado para " + evento.status());
    }
}
