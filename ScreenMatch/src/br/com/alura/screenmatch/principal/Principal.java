package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Filme favorito = new Filme("O Senhor dos Anéis - O Retorno do Rei", 2003);
        favorito.setDuracaoEmMinutos(201);
        favorito.setIncluidoNoPlano(true);

        favorito.exibeFichaTecnica();
        favorito.avalia(9);
        favorito.avalia(8);
        favorito.avalia(9);
        System.out.println("Média de avaliações do filme: " + favorito.pegaMedia());

        Serie lost = new Serie("Lost", 2001);
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(50);
        System.out.println("Duração maratona Lost: " + lost.getDuracaoEmMinutos());

        Filme outroFIlme = new Filme("Interstellar", 2014);
        outroFIlme.setDuracaoEmMinutos(169);

        Filme filme2 = new Filme("Conan, o Bárbaro", 1982);
        filme2.setDuracaoEmMinutos(129);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(favorito);
        //calculadora.inclui(outroFIlme);
        System.out.println(calculadora.getTempoTotal());

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualizacoes(300);

        FiltroRecomendacao filtro = new FiltroRecomendacao();
//        filtro.filtra(favorito);
//        filtro.filtra(episodio);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(favorito);
        listaDeFilmes.add(outroFIlme);
        listaDeFilmes.add(filme2);
        System.out.println("Tamanho da lista: " + listaDeFilmes.size());
        System.out.println("Primeiro filme: " + listaDeFilmes.get(0).getNome());
        System.out.println(listaDeFilmes);


    }
}

