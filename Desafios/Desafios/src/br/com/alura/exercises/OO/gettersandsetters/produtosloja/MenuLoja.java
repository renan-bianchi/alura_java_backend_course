package br.com.alura.exercises.OO.gettersandsetters.produtosloja;

import java.util.Scanner;

public class MenuLoja {
    public void exibeMenuLoja () throws InterruptedException {
        System.out.println("""
                ### Escolha a opção desejada: ###
                | 1- Cadastrar produtos             |
                | 2- Exibir informações de produtos |
                | 3- Sair                           |
                """);
        Scanner readInput = new Scanner(System.in);
        CadastroProduto novoProduto = new CadastroProduto();

        switch (readInput.nextInt()){
            case 1:
                System.out.println("Cadastro de produtos");
                Thread.sleep(2000);
                novoProduto.cadastraProduto();
                break;
            case 2:
                System.out.println("Ainda não há produtos cadastrados!");
                break;
            default:
                break;
        }
    }
}
