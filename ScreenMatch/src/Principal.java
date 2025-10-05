import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
        Filme favorito = new Filme();
        favorito.setNome("O Senhor dos Anéis");
        favorito.setAnoDeLancamento(2003);
        favorito.setDuracaoEmMinutos(188);
        favorito.setIncluidoNoPlano(true);

        favorito.exibeFichaTecnica();
        favorito.avalia(9);
        favorito.avalia(8);
        favorito.avalia(9);
        System.out.println("Média de avaliações do filme: " + favorito.pegaMedia());

        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setAnoDeLancamento(2001);
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(50);
        System.out.println("Duração maratona Lost: " + lost.getDuracaoEmMinutos());

        Filme outroFIlme = new Filme();
        outroFIlme.setNome("Interstellar");
        outroFIlme.setAnoDeLancamento(2015);
        outroFIlme.setDuracaoEmMinutos(177);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(favorito);
        calculadora.inclui(outroFIlme);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(favorito);
    }
}

