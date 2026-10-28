package br.edu.arquitetura.u2a3.criacionais.singleton;

public final class ConfiguracaoLog {
    private final String nivel;

    private ConfiguracaoLog() {
        this.nivel = "INFO";
    }

    private static class Instancia {
        private static final ConfiguracaoLog UNICA = new ConfiguracaoLog();
    }

    public static ConfiguracaoLog getInstance() {
        return Instancia.UNICA;
    }

    public String nivel() {
        return nivel;
    }
}
