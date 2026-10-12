import br.com.alura.exercises.OO.interfaces.conversortemperatura.ConversorTemperaturaPadrao;
import br.com.alura.exercises.OO.listasarraysetc.loopsereferencias.Animal;
import br.com.alura.exercises.OO.listasarraysetc.loopsereferencias.Cachorro;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        /*Scanner selectExercise = new Scanner(System.in);
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
        }*/

        //############################################################################################

        /*
        CalculadoraSalaRetangular novoCalculo = new CalculadoraSalaRetangular();
        novoCalculo.setBase(2);
        novoCalculo.setAltura(5);
        System.out.println("area: "+ novoCalculo.calcularArea());
        System.out.println("perimetro: "+ novoCalculo.calcularPerimetro());
        */

        //#############################################################################################

        /*TabuadaMultiplicacao novaTabuada = new TabuadaMultiplicacao();
        novaTabuada.setFatorTabuada(3);
        novaTabuada.mostrarTabuada();*/

        //#############################################################################################

        /*ConversorTemperaturaPadrao novaConversao = new ConversorTemperaturaPadrao();
        novaConversao.setTemperatura(25.5);
        novaConversao.setSeletorFunc(1);
        novaConversao.selecionaFunc();*/

        //#############################################################################################

        // Crie um ArrayList de strings e utilize um loop foreach para percorrer e imprimir cada elemento da lista.
//        ArrayList<String> myStrings = new ArrayList<>();
//        myStrings.add("primera");
//        myStrings.add("segunda");
//        myStrings.add("terceira");
//        myStrings.add("quarta");
//
//        for( String myString : myStrings ){
//            System.out.println(myString);
//        }

        //#############################################################################################

        // Crie uma classe Animal e uma classe Cachorro que herda de Animal. Em seguida, crie um objeto da
        // classe Cachorro e faça o casting para a classe Animal.

        Cachorro meuDog = new Cachorro();


    }
}