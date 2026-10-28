package br.edu.arquitetura.u2a3.estruturais.decorator;

public final class NotificadorBase implements Notificador {
    @Override
    public String enviar(String mensagem) {
        return "push: " + mensagem;
    }
}
