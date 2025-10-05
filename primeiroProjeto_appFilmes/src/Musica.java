public class Musica {
    String titulo;
    String artista;
    int anoLancamento;
    double[] avaliacoes;
    int numAvaliacoes;

    float mediaAvaliacoes(){
        float totalAvaliacoes = 0;
        for (int i = 0; i < avaliacoes.length; i++){
            totalAvaliacoes += avaliacoes[i];
        }
        return totalAvaliacoes / numAvaliacoes;
    }

    void exibeFichaTecnica(){
        System.out.println("##### FICHA TÉCNICA #####");
        System.out.println(" - Título: " + titulo);
        System.out.println(" - Artista: " + artista);
        System.out.println(" - Ano de lançamento: " + anoLancamento);
        System.out.println(" - Avaliação: " + mediaAvaliacoes());
    }
}
