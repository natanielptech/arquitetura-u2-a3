package br.edu.arquitetura.u2a3.estruturais.decorator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NotificadorTest {
    @Test
    void combinaCanaisSemCriarSubclassesParaCadaCombinacao() {
        Notificador notificador = new SmsDecorator(new EmailDecorator(new NotificadorBase()));
        assertEquals("push: pedido enviado | email: pedido enviado | sms: pedido enviado",
                notificador.enviar("pedido enviado"));
    }
}
