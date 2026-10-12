package entidades;

public class Produto implements Comparable<Produto> {
    private String nome;
    private double valor;

    public Produto(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }

    public boolean consultaSaldo (double saldo) {
        if ( saldo >= this.valor ){
            System.out.println("aprovado");
            return true;
        } else {
            System.out.println("não aprovado");
            return false;
        }
    }

    @Override
    public int compareTo(Produto outroProduto) {
        return Double.valueOf(this.valor).compareTo(outroProduto.valor);
    }
}
