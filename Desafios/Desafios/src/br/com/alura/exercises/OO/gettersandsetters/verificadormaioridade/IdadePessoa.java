package br.com.alura.exercises.OO.gettersandsetters.verificadormaioridade;

import java.util.Scanner;

public class IdadePessoa {
    private String nome;
    private int idade;

    public String msgMenuNome = "Bem vindo, informe seu nome:";
    public String msgMenuIdade = "Agora informe sua idade:";

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void verificacaoMaioridade(){
        boolean maiorIdade = idade > 18;
        if (maiorIdade){
            System.out.println(nome + ", você é MAIOR de idade!");
        } else {
            System.out.println(nome + ", você é MENOR de idade!");
        }
    }

    public void displayMenuExIdade () throws InterruptedException {
        Scanner readInput = new Scanner(System.in);
        System.out.println(msgMenuNome);
        setNome(readInput.nextLine());
        System.out.println(msgMenuIdade);
        setIdade(readInput.nextInt());
        Thread.sleep(2000);
        System.out.println("Verificando sua idade.");
        Thread.sleep(500);
        System.out.println(".");
        Thread.sleep(500);
        System.out.println(".");
        verificacaoMaioridade();
    }
}
