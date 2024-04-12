package ClientesProdutos.Model;

public class Produto {
    private String nomeProduto;
    private int qtdEstoque;
    private double preco;

    public Produto() {}

    public Produto(String nomeProduto, int qtdEstoque, double preco) {
        this.nomeProduto = nomeProduto;
        this.qtdEstoque = qtdEstoque;
        this.preco = preco;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public int getQtdEstoque() {
        return qtdEstoque;
    }

    public void setQtdEstoque(int qtdEstoque) {
        this.qtdEstoque = qtdEstoque;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
