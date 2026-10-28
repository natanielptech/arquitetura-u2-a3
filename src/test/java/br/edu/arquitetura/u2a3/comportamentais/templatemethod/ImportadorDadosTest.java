package br.edu.arquitetura.u2a3.comportamentais.templatemethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ImportadorDadosTest {
    @Test
    void importaRegistrosCsvPeloEsqueletoDaClasseBase() {
        var importador = new ImportadorDados.ImportadorCsv();
        assertEquals(java.util.List.of("a,1", "b,2"), importador.importar("a,1\nb,2"));
    }

    @Test
    void validaRegistrosAntesDeSalvar() {
        assertThrows(IllegalArgumentException.class,
                () -> new ImportadorDados.ImportadorCsv().importar("registro-invalido"));
    }
}
