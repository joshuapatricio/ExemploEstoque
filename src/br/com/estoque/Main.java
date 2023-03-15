package br.com.estoque;

public class Main {

    public static void main(String[] args){
        estoque e1 = new estoque();
        e1.setNome("Caneta");
        e1.setQtdAtual(10);
        e1.setQtdMinima(5);
        System.out.println(e1.mostra());

        estoque e2 = new estoque(this.codProduto:1,this.nome:"Caderno",this.qtdAtual:20,this.qtdMinima:5)
        e2.darBaixa(10);
        System.out.println("Estoque Atual" + e2.getQtdAtual());
        e2.darBaixa(1000);
        System.out.println(e2.precisaRepor());
    }

}
