package br.com.alura.exercises.OO.gettersandsetters.produtosloja;

public class Produto {
    private String nomeProduto;
    private double valorProduto;
    private double descontoPix;

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public double getValorProduto() {
        return valorProduto;
    }

    public void setValorProduto(double valorProduto) {
        this.valorProduto = valorProduto;
    }

    public double getDescontoPix() {
        return descontoPix;
    }

    public void setDescontoPix(double descontoPix) {
        this.descontoPix = descontoPix;
    }

    public double calculaValorComDesconto (){
        double calculoDesconto = (getValorProduto()) * (getDescontoPix());
        return (getValorProduto()) - calculoDesconto;
    }

}
