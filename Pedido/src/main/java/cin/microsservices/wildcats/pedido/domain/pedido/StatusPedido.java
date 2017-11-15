package cin.microsservices.wildcats.pedido.domain.pedido;

public enum StatusPedido {

    ABERTO("ABERTO"), CONCLUIDO("CONCLUIDO"), CANCELADO("CANCELADO");

    private final String status;

    private StatusPedido(String statusPedido) {
        status = statusPedido;
    }

    public String toString() {
        return this.status;
    }

}
