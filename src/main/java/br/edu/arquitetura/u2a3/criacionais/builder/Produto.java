package br.edu.arquitetura.u2a3.criacionais.builder;

import java.util.List;

public record Produto(String cor, int tamanho, List<String> acessorios) {
    public Produto {
        acessorios = List.copyOf(acessorios);
    }

    public static class Builder {
        private String cor = "natural";
        private int tamanho = 1;
        private final java.util.ArrayList<String> acessorios = new java.util.ArrayList<>();

        public Builder definirCor(String cor) {
            this.cor = java.util.Objects.requireNonNull(cor);
            return this;
        }

        public Builder definirTamanho(int tamanho) {
            if (tamanho <= 0) throw new IllegalArgumentException("tamanho deve ser positivo");
            this.tamanho = tamanho;
            return this;
        }

        public Builder adicionarAcessorio(String acessorio) {
            acessorios.add(java.util.Objects.requireNonNull(acessorio));
            return this;
        }

        public Produto construir() {
            return new Produto(cor, tamanho, acessorios);
        }
    }
}
