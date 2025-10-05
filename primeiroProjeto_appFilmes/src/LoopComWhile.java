import java.util.Scanner;

public class LoopComWhile {
    public static void main(String[] args) {
        Scanner inputNota = new Scanner(System.in);
        double media = 0;
        int qtdNotas = 0;
        double nota = 0;

        while (nota != -1) { //digitar -1 para sair do loop e finalizar.

            System.out.println("Insira sua nota");
            nota = inputNota.nextDouble();
            if(nota != -1) {
                media += nota;
                qtdNotas++;
            }

        }
        System.out.println("Quantidade de avaliações: " +qtdNotas);
        System.out.println(String.format("Media: %.2f", (media / qtdNotas)));
    }
}
