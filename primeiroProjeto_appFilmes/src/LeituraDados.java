import java.util.Scanner;

public class LeituraDados {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite o nome do filme: ");
        String nomeFilme = leitura.nextLine();
        System.out.println(nomeFilme);

    }
}
