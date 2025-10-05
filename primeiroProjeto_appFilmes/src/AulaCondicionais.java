public class AulaCondicionais {
    public static void main(String[] args) {
        String filme = "O Senhor dos Anéis - O Retorno do Rei";
        int anoDeLancamento = 2003;
        boolean incluidoNoPlano = true;

        double nota1 = 9.5;
        double nota2 = 9.9;
        double nota3 = 10.0;
        double media = (nota1 + nota2 + nota3) /3;
        int classificacao = (int) media / 2;
        System.out.println("Filme: " + filme);
        System.out.println("Classificacao do filme é: " + classificacao);
    }
}
