package cin.microsservices.wildcats.pedido.domain.pedido;

public class ItemPedido {

    private long idProduto;

    private long quantidade;

    public long getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(long idProduto) {
        this.idProduto = idProduto;
    }

    public long getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(long quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public boolean equals(Object obj) {

        ItemPedido item = (ItemPedido) obj;

        return idProduto == item.getIdProduto() ? true : false;
    }

}
