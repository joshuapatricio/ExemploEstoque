package br.com.estoque;

public class estoque {
    private int codProduto;
    private String nome;
    private int qtdAtual;
    private int qtdMinima;

    public estoque(int codProduto, String nome, int qtdAtual, int qtdMinima) {
        this.codProduto = codProduto;
        this.nome = nome;
        this.qtdAtual = qtdAtual;
        this.qtdMinima = qtdMinima;
    }

    public estoque(int cod, String produto){
        this.codProduto = cod;
        this.nome = produto;
    }

    public int getCodProduto() {
        return codProduto;
    }

    public void setCodProduto(int codProduto) {
        this.codProduto = codProduto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtdAtual() {
        return qtdAtual;
    }

    public void setQtdAtual(int qtdAtual) {
        this.qtdAtual = qtdAtual;
    }

    public int getQtdMinima() {
        return qtdMinima;
    }

    public void setQtdMinima(int qtdMinima) {
        this.qtdMinima = qtdMinima;
    }


    public void darBaixa(int qtd){
        if(qtd<=qtdAtual)
            qtdAtual = qtdAtual - qtd;
        else
            System.out.println("Estoque insuficiente para baixa");
    }
    public String mostra(){
        return "Produto: " + this.nome + "\nQtde Atual: " + this.qtdMinima + "\nQtde Atual: " + this.qtdAtual;

}
    public boolean precisaRepor(){
        if (getQtdAtual()<=getQtdMinima())
            return true;
        else
            return false;
    }

}
