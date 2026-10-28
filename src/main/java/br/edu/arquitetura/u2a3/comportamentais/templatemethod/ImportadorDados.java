package br.edu.arquitetura.u2a3.comportamentais.templatemethod;

import java.util.List;

public abstract class ImportadorDados {
    public final List<String> importar(String conteudo) {
        abrirArquivo();
        try {
            List<String> registros = lerRegistros(conteudo);
            validar(registros);
            salvar(registros);
            return registros;
        } finally {
            fecharArquivo();
        }
    }

    protected void abrirArquivo() {}
    protected abstract List<String> lerRegistros(String conteudo);
    protected abstract void validar(List<String> registros);
    protected void salvar(List<String> registros) {}
    protected void fecharArquivo() {}

    public static final class ImportadorCsv extends ImportadorDados {
        protected List<String> lerRegistros(String conteudo) {
            return conteudo.lines().filter(linha -> !linha.isBlank()).toList();
        }

        protected void validar(List<String> registros) {
            if (registros.stream().anyMatch(linha -> !linha.contains(","))) {
                throw new IllegalArgumentException("registro CSV invalido");
            }
        }
    }
}
