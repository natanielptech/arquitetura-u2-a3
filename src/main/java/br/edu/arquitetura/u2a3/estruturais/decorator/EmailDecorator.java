package br.edu.arquitetura.u2a3.estruturais.decorator;

public final class EmailDecorator extends NotificadorDecorator {
    public EmailDecorator(Notificador envolvido) { super(envolvido); }

    @Override
    public String enviar(String mensagem) {
        return envolvido.enviar(mensagem) + " | email: " + mensagem;
    }
}
