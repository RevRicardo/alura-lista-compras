package compras;

import produtos.Produtos;

public class CompraEfetuada {
    private Produtos produto;
    private int quantidade;
    private double valorTotalCompra;

    public CompraEfetuada(Produtos produto, int quantidade, double valorTotalCompra) {
        this.produto = produto;
        this.quantidade = quantidade;
        this.valorTotalCompra = valorTotalCompra;
    }

    public Produtos getProduto() {
        return produto;
    }

    public void setProduto(Produtos produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValorTotalCompra() {
        return valorTotalCompra;
    }

    public void setValorTotalCompra(double valorTotalCompra) {
        this.valorTotalCompra = valorTotalCompra;
    }
}

