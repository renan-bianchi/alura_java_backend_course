package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme favorito = new Filme("O Senhor dos Anéis - O Retorno do Rei", 2003);
        favorito.avalia(10);
        Filme outroFIlme = new Filme("Interstellar", 2014);
        outroFIlme.avalia(8);
        Filme filme2 = new Filme("Conan, o Bárbaro", 1982);
        filme2.avalia(9);
        Serie lost = new Serie("Lost", 2001);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(favorito);
        lista.add(outroFIlme);
        lista.add(filme2);
        lista.add(lost);

        for (Titulo item: lista) {
            System.out.println(item.getNome());
            if (item instanceof Filme filme && filme.getClassificacao() > 2){
                System.out.println("Classificação: " + filme.getClassificacao());
                /*SE a instancia é um filme E a classificação do filme for maior q 2 aí mostra a nota,
                senão não faz nada. Funcionalidade de pattern matching chegou no JAVA 17*/
            }

        }

        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Paulo");
        buscaPorArtista.add("Jaqueline");
        System.out.println(buscaPorArtista);

        Collections.sort(buscaPorArtista);
        System.out.println("Depois da ordenação: " + buscaPorArtista);

        Collections.sort(lista);
        System.out.println(lista);
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Ordenando por ano: ");
        System.out.println(lista);

    }
}




// ********************************************
// Exemplos de foreach: ***********************
// ********************************************

// _____________________________________________________
// ArrayList<String> nomes = new ArrayList<>();
// nomes.add("Jacqueline");
// nomes.add("Paulo");
// nomes.add("Suellen");
// nomes.add("Emily");
//
// for (String nome : nomes) {
//        System.out.println(nome);
// }
// _____________________________________________________

// Esse loop for percorre todos os elementos da lista, atribuindo cada um deles à variável nome, que é usada para
// imprimir o valor na tela. Esse tipo de loop é muito útil em situações onde não precisamos realizar nenhuma
// operação complexa sobre os elementos da lista.
// No entanto, a partir do Java 8, foi adicionado na interface List, a qual a classe ArrayList implementa, um novo
// mét.odo chamado forEach, que possibilita a iteração sobre os elementos da lista de forma mais concisa e elegante.
// Por exemplo, o exemplo anterior pode ser reescrito utilizando o mét.odo forEach da seguinte forma:

// _________________________________________________
// nomes.forEach(nome -> System.out.println(nome));
// -------------------------------------------------

// Nesse caso, o mét.odo forEach é chamado sobre a lista nomes e recebe como parâmetro uma expressão lambda que
// realiza a impressão do valor na tela. A expressão lambda nome -> System.out.println(nome) é uma forma compacta
// de definir uma função que recebe um parâmetro nome e realiza a operação de impressão.

// É possível simplificar ainda mais o exemplo de código anterior, utilizando o recurso conhecido como Method
// Reference, que nada mais é do que uma forma reduzida de uma expressão lambda:

// ______________________________________
// nomes.forEach(System.out::println);
// --------------------------------------


// ********************************************
// Para saber mais: variáveis e referências ***
// ********************************************

// Uma questão importante relacionada com referências a objetos em Java é a questão da igualdade e identidade de
// objetos. Quando você compara duas referências de objeto usando o operador de igualdade ==, está comparando as
// referências em si, não os objetos que elas apontam. Por exemplo:

// ___________________________________________
// Filme filme1 = new Filme("Avatar", 2009);
// Filme filme2 = new Filme("Avatar", 2009);

// if (filme1 == filme2) {
//         System.out.println("Iguais");
// } else {
//         System.out.println("Diferentes");
// }
// -------------------------------------------

// No exemplo de código anterior, a saída no console será: "Diferentes". Embora os dois objetos tenham as mesmas
// informações na memória, a comparação com == verifica se as referências são iguais, ou seja, se apontam para o
// mesmo objeto na memória.