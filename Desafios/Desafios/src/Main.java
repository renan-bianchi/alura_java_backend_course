import java.awt.*;
import java.util.Scanner;
import br.com.alura.exercises.OO.gettersandsetters.bankaccountexercise.BankAccount;
import br.com.alura.exercises.OO.gettersandsetters.produtosloja.MenuLoja;
import br.com.alura.exercises.OO.gettersandsetters.verificadormaioridade.IdadePessoa;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Scanner selectExercise = new Scanner(System.in);
        System.out.println("""
                Hello! What exercise do you want to view?
                1 - Bank Account
                2 - Verificador de idade
                3 - Loja
                4 - Outros...""");
        int selectedExercise = selectExercise.nextInt();
        switch (selectedExercise){
            case 1:
                BankAccount newAccount = new BankAccount();
                newAccount.bankAccountExercise();
                break;
            case 2:
                IdadePessoa idadePessoa = new IdadePessoa();
                idadePessoa.displayMenuExIdade();
                break;
            case 3:
                MenuLoja menuLoja = new MenuLoja();
                menuLoja.exibeMenuLoja();
                break;
            default:
                System.out.println("Invalid option!");
                break;
        }
    }
}