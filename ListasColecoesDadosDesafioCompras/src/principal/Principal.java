package principal;

import entidades.Carrinho;
import entidades.Cartao;
import entidades.Produto;

import java.util.Collections;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual o limite do cartão?");
        double limite = scanner.nextDouble();

        Cartao meuCartao = new Cartao(limite);
        System.out.println("Limite: " + meuCartao.getLimite());

        Carrinho meuCarrinho = new Carrinho();

        int sair = 0;
        while (sair == 0) {
            System.out.println("Qual o nome  produto?");
            String novoProdutoNome = scanner.next();

            System.out.println("Qual o valor da compra?");
            double novoProdutoValor = scanner.nextDouble();

            Produto novoProduto = new Produto(novoProdutoNome, novoProdutoValor);
            if (novoProduto.consultaSaldo(meuCartao.getSaldo())) {
                meuCartao.descontaSaldo(novoProduto.getValor());
                meuCarrinho.adicionaProduto(novoProduto);
            } else {
                System.out.println("SALDO INSUFICIENTE!!");
            }

            System.out.println("Deseja finalizar a compra e SAIR? Digite 1 para SIM e 0 para NÃO");
            int menuSair = scanner.nextInt();
            sair = menuSair;
        }

        System.out.println("Minhas compras: ");
        Collections.sort(meuCarrinho.getProdutosComprados());
        for (Produto p : meuCarrinho.getProdutosComprados()) {
            System.out.println(p.getNome() + " - " + p.getValor());
        }
    }
}
