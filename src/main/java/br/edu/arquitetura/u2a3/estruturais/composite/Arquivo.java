package br.edu.arquitetura.u2a3.estruturais.composite;

public record Arquivo(long calcularTamanho) implements ItemFS {
    public Arquivo {
        if (calcularTamanho < 0) throw new IllegalArgumentException("tamanho nao pode ser negativo");
    }
}
