package principal;

import modelos.Cartao;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        // ####################### ___ MENU ___ ###########################

        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual o limite do seu cartão?");
        double limiteCartao = scanner.nextDouble();
        Cartao novoCartao = new Cartao(limiteCartao);

        System.out.println("Qual produto você quer comprar");
        String nomeProduto = scanner.nextLine();
        System.out.println("Qual valor o valor do produto?");
        Double valorProduto = scanner.nextDouble();


        var carrinho =+ valorProduto;





       while ( carrinho < novoCartao.getSaldoCartao() ){
            System.out.println("Qual produto você quer comprar");
       }

       // printar a lista de produtos com um foreach formatado para aparecer bonitinho nome e valor
    }
}