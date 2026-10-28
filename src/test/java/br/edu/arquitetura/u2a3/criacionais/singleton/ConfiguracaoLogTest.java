package br.edu.arquitetura.u2a3.criacionais.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertSame;

class ConfiguracaoLogTest {
    @Test
    void retornaSempreAUnicaInstancia() {
        assertSame(ConfiguracaoLog.getInstance(), ConfiguracaoLog.getInstance());
    }
}
