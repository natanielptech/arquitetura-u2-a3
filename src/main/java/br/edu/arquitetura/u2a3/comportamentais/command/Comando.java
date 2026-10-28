package br.edu.arquitetura.u2a3.comportamentais.command;

public interface Comando {
    void executar();
    void desfazer();
}
