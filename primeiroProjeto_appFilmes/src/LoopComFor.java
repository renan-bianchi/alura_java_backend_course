import java.util.Scanner;

public class LoopComFor {
    public static void main(String[] args) {
        Scanner inputNota = new Scanner(System.in);
        double media = 0;
        int qtdNotas = 3;
        for (int i = 0; i < qtdNotas; i++) {
            System.out.println("Insira sua nota");
            double nota = inputNota.nextDouble();
            media += nota;
        }
        System.out.println(String.format("Media: %.2f", (media / qtdNotas)));
    }
}
