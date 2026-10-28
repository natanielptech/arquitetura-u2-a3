package br.edu.arquitetura.u2a3.estruturais.adapter;

import java.util.Objects;

public final class AdaptadorFreteExterno implements CalculadoraFrete {
    private final LibFreteExterna lib;

    public AdaptadorFreteExterno(LibFreteExterna lib) {
        this.lib = Objects.requireNonNull(lib);
    }

    @Override
    public double calcular(String cepOrigem, String cepDestino, double pesoKg) {
        return lib.cotar(cepOrigem, cepDestino, pesoKg);
    }

    public interface LibFreteExterna {
        double cotar(String cepOrigem, String cepDestino, double pesoKg);
    }
}
