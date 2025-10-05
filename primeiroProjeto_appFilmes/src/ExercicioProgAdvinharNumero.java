import java.util.Random;
import java.util.Scanner;

public class ExercicioProgAdvinharNumero {
    public static void main(String[] args) {
        int numeroAleatorio = new Random().nextInt(100);
        Scanner inputPalpite = new Scanner(System.in);
        int palpite = 0;
        System.out.println("""
                |--------------------------------------------------------|
                |-                  ADIVINHE O NÚMERO                   -|
                |--------------------------------------------------------|""");
        int totalTentativas = 5;
        int nTentativa = 0;
        for (int i = 0; i < totalTentativas; i++) {
            //Old switch statement:
            /*String nomeTentativa;
            switch (nTentativa) {
                case 1: nomeTentativa = "primeiro";break;
                case 2: nomeTentativa = "segundo";break;
                case 3: nomeTentativa = "terceiro";break;
                case 4: nomeTentativa = "quarto";break;
                default: nomeTentativa = "quinto";break;
            }*/

            //Enhanced switch expression:
            nTentativa++;
            String nomeTentativa = switch (nTentativa) {
                case 1 -> "primeiro";
                case 2 -> "segundo";
                case 3 -> "terceiro";
                case 4 -> "quarto";
                default -> "quinto";
            };
            System.out.println("Tentativa: " + nTentativa);
            if (nTentativa == 5) {
                System.out.println("ULTIMA TENTATIVA!");
            }
            System.out.println("Digite seu " + nomeTentativa + " palpite:");
            palpite = inputPalpite.nextInt();
            if (palpite == numeroAleatorio){
                System.out.println("Parabéns, você acertou!!");
                break;
            } else if (palpite < numeroAleatorio) {
                System.out.println("Um pouco mais...");
            } else {
                System.out.println("Um pouco menos!!");
            }
        }
        if (nTentativa == 5 && palpite != numeroAleatorio){
            System.out.println("Que pena, você perdeu :(");
            System.out.println("O número era: " + numeroAleatorio);
        }
    }
}

