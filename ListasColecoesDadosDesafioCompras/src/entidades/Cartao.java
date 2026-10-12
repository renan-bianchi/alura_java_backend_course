package entidades;

public class Cartao {
    private final double limite;
    private double saldo;

    public Cartao(double limite) {
        this.limite = limite;
        this.saldo = limite;
    }

    public double getLimite() {
        return limite;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean descontaSaldo(double compra){
        if (compra <= this.limite){
            this.saldo -= compra;
            System.out.println("novo saldo: " + this.saldo);
            return true;
        } else {
            System.out.println("Saldo insuficiente");
            return false;
        }
    }
}
