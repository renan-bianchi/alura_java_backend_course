import java.util.Scanner;
/* criar tela intermediária para calcular saldo da conta...
pensar uma solução para puxar um valor inicial, mas depois poder ir atualizando
 */
public class Main {
    public static void main(String[] args) {
        menuPrincipal();
    }

    public static void menuPrincipal(){
        System.out.println("""
                |----------------------------------------------------|
                |-                    BEM VINDO!                    -|
                |----------------------------------------------------|""");
        System.out.println();

        String nomeUsuario = "Renan Bianchi";
        String numeroContaCadastrada = "01234-5";
        String agencia = "4321";

        boolean logonKey = true;
        while (logonKey){
            System.out.println("Digite o numero da sua conta: ");
            logonKey = true;
            Scanner inputNumeroConta = new Scanner(System.in);
            String numeroConta = inputNumeroConta.nextLine();

            if (numeroConta.equals(numeroContaCadastrada)){
                telaConta(nomeUsuario, numeroContaCadastrada, agencia);
                logonKey = false;
            } else {
                System.out.println("Conta inválida!");
            }
        }
    }

    public static void telaConta(String nomeUsuario, String numeroContaCadastrada, String agencia, double saldoConta) {
        double saldoConta = 2500.50;
        System.out.println(String.format("""
                    | Nome: %s
                    | Conta corrente: %s
                    | Agência: %s
                    | Saldo: %.2f""", nomeUsuario, numeroContaCadastrada, agencia, saldoConta));

        boolean menuExit = true;
        while (menuExit){
            System.out.println("""
                    | Digite a opção desejada:
                    | 1 - Extrato
                    | 2 - Deposito
                    | 3 - Saque
                    | 4 - Transferência
                    | 5 - Empréstimo
                    | 0 - Voltar ao menu principal""");

            Scanner inputOpcaoTransacao = new Scanner(System.in);
            int opcaoTransacao = inputOpcaoTransacao.nextInt();
            menuExit = true;
            switch (opcaoTransacao){
                case 1: menuExit = false; telaExtrato(saldoConta); break;
                case 2: menuExit = false; telaDeposito(saldoConta); break;
                case 3: menuExit = false; telaSaque(); break;
                case 4: menuExit = false; telaTransferencia(); break;
                case 5: menuExit = false; telaEmprestimo(); break;
                case 0: menuExit = false; menuPrincipal(); break;
                default:
                    System.out.println("Opção inválida, tente novamente!");
        }

        }

    }

    public static void telaExtrato(double totalSaldo){
        String telaExtratoTexto = """
                |----------------EXTRATO----------------|
                02/04... -100,00 - SABESP
                05/04... 230,00 - PIX Antonina
                10/04... -40,00 - Leo Cabeleireiro""";

        System.out.println(telaExtratoTexto);
        System.out.println("|---------------------------------------|");
        System.out.println();
        System.out.println(String.format("Saldo total: %.2f", totalSaldo));
    }
    public static void telaDeposito(double saldoConta){
        System.out.println("""
                |----------------DEPOSITO----------------|
                Digite a quantia que deseja depositar:""");
        Scanner inputValorDeposito = new Scanner(System.in);
        double valorDeposito = inputValorDeposito.nextDouble();

        saldoConta += valorDeposito;

        telaConta(saldoConta);

    }
    public static void telaSaque(){
        System.out.println("SAQUE");
    }
    public static void telaTransferencia(){
        System.out.println("TRANSFERENCIA");
    }
    public static void telaEmprestimo(){
        System.out.println("EMPRESTIMO");
    }
}