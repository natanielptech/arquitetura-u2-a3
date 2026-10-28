package br.edu.arquitetura.u2a3.criacionais.abstractfactory;

public interface FabricaTema {
    Botao criarBotao();
    CaixaTexto criarCaixaTexto();
    Menu criarMenu();

    interface Botao {
        String tema();
    }

    interface CaixaTexto {
        String tema();
    }

    interface Menu {
        String tema();
    }

    final class FabricaClaro implements FabricaTema {
        public Botao criarBotao() { return () -> "claro"; }
        public CaixaTexto criarCaixaTexto() { return () -> "claro"; }
        public Menu criarMenu() { return () -> "claro"; }
    }

    final class FabricaEscuro implements FabricaTema {
        public Botao criarBotao() { return () -> "escuro"; }
        public CaixaTexto criarCaixaTexto() { return () -> "escuro"; }
        public Menu criarMenu() { return () -> "escuro"; }
    }
}
