package br.com.alura.exercises.OO.gettersandsetters.produtosloja;

import java.util.Scanner;

public class CadastroProduto {

    public Produto cadastraProduto (){
        Produto novoProduto = new Produto();
        Scanner userInput = new Scanner(System.in);
        System.out.println("Nome do produto: ");
        novoProduto.setNomeProduto(userInput.nextLine());
        System.out.println("Valor do produto: ");
        novoProduto.setValorProduto(userInput.nextDouble());
        System.out.println("Desconto pagto Pix: ");
        novoProduto.setDescontoPix(userInput.nextDouble());
        return novoProduto;
    }

    public void exibeInfosProduto (Produto novoProduto){
        System.out.println("Nome: " + novoProduto.getNomeProduto());
        System.out.println("Valor: " + novoProduto.getValorProduto());
        System.out.println(("Desconto para pagamento PIX: " + novoProduto.calculaValorComDesconto()));
    }
}
