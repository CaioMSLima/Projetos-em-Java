package Loja.entidades;

public class PedidosItem {

    private Integer quantidade;
    private Double preco;

    private Produtos produto;

    public PedidosItem() {
    }

    public PedidosItem(Integer quantidade, Double preco, Produtos produto) {
        this.quantidade = quantidade;
        this.preco = preco;
        this.produto = produto;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Produtos getProduto() {
        return produto;
    }

    public void setProduto(Produtos produto) {
        this.produto = produto;
    }

    public Double subTotal(){
        return preco * quantidade;
    }

    public String toString(){
        return  produto.getNome()
                + ", $"
                + String.format("%.2f", preco)
                + "Quantidade: "
                + quantidade
                +", SUbtotal: $"
                + String.format("%.2f" , subTotal());
    }
}
