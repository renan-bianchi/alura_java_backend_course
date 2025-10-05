public class Main {
    public static void main(String[] args) {
        /*String filme = "O Senhor dos Anéis - O Retorno do Rei";
        double nota1 = 9.5;
        double nota2 = 9.9;
        double nota3 = 10.0;
        double media = (nota1 + nota2 + nota3) /3;
        int classificacao = (int) media / 2;
        System.out.println("Filme: " + filme);
        System.out.println("Classificacao do filme é: " + classificacao);*/

        //---------------------------------------------------------------------//
        /*int temperaturaC = 23;
        double temperaturaConvertidaF = (temperaturaC * 1.8) + 32;
        System.out.println("A temperatura em Fahrenheit é: " + (int) temperaturaConvertidaF);*/
        //---------------------------------------------------------------------//
        /*double valorEmDolar = 1.0;
        double valorEmReal = valorEmDolar * 4.97;
        System.out.println(String.format("O valor em dolar é %.2f.", valorEmReal));*/
        //---------------------------------------------------------------------//
        /*double valorProduto = 10.05;
        double percentualDesc = 15;
        double calcPercent = valorProduto / 100 * percentualDesc;
        double valorDescAplicado = valorProduto - calcPercent;
        System.out.println(String.format("O valor com desconto é: %.2f", valorDescAplicado));*/
        //---------------------------------------------------------------------//
        /*Pessoa saudacao = new Pessoa();
        saudacao.olaMundo("Renan");*/
        //---------------------------------------------------------------------//
        /*CalculadoraDobro novoCalculo = new CalculadoraDobro();
        novoCalculo.calculaDobro();*/

        Musica novaMusica = new Musica();

        novaMusica.titulo = "Desperate Cry";
        novaMusica.artista = "HellLight";
        novaMusica.anoLancamento = 2025;
        novaMusica.numAvaliacoes = 3;
        novaMusica.avaliacoes = new double[novaMusica.numAvaliacoes];
        novaMusica.avaliacoes[0] = 9.5;
        novaMusica.avaliacoes[1] = 8.2;
        novaMusica.avaliacoes[2] = 9.1;

        /*double result = novaMusica.mediaAvaliacoes();
        System.out.println("teste " + result);*/
        novaMusica.exibeFichaTecnica();

    }
}