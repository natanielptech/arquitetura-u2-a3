package br.edu.arquitetura.u2a3.estruturais.composite;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public final class Pasta implements ItemFS {
    private final List<ItemFS> filhos = new ArrayList<>();

    public void adicionar(ItemFS item) {
        filhos.add(Objects.requireNonNull(item));
    }

    public List<ItemFS> filhos() {
        return List.copyOf(filhos);
    }

    @Override
    public long calcularTamanho() {
        return filhos.stream().mapToLong(ItemFS::calcularTamanho).sum();
    }
}
