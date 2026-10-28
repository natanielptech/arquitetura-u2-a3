package br.edu.arquitetura.u2a3.estruturais.decorator;

public final class SmsDecorator extends NotificadorDecorator {
    public SmsDecorator(Notificador envolvido) { super(envolvido); }

    @Override
    public String enviar(String mensagem) {
        return envolvido.enviar(mensagem) + " | sms: " + mensagem;
    }
}
