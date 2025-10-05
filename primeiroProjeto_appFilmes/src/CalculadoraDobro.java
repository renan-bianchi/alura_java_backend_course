import java.util.Scanner;

public class CalculadoraDobro {
    void calculaDobro(){
        Scanner leituraNumero = new Scanner(System.in);
        System.out.println("Informe o número: ");
        double numero = leituraNumero.nextDouble();
        System.out.println(numero * 2);
    }
}
