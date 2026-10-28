package br.edu.arquitetura.u2a3.comportamentais.command;

import java.util.Objects;

public final class CriarPedidoCmd implements Comando {
    private final PedidoService pedidoService;
    private final String codigo;

    public CriarPedidoCmd(PedidoService pedidoService, String codigo) {
        this.pedidoService = Objects.requireNonNull(pedidoService);
        this.codigo = Objects.requireNonNull(codigo);
    }

    public void executar() { pedidoService.criar(codigo); }
    public void desfazer() { pedidoService.cancelar(codigo); }

    public static final class PedidoService {
        private final java.util.Set<String> pedidos = new java.util.HashSet<>();

        public void criar(String codigo) {
            if (!pedidos.add(codigo)) throw new IllegalStateException("pedido ja existe");
        }

        public void cancelar(String codigo) {
            pedidos.remove(codigo);
        }

        public boolean existe(String codigo) {
            return pedidos.contains(codigo);
        }
    }
}
