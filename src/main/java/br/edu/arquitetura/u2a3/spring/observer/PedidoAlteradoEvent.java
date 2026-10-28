package br.edu.arquitetura.u2a3.spring.observer;

import br.edu.arquitetura.u2a3.comportamentais.observer.Pedido;

public record PedidoAlteradoEvent(String codigo, Pedido.Status status) {
}
