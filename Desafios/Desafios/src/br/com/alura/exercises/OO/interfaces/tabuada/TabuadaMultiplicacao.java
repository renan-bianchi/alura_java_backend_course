package br.com.alura.exercises.OO.interfaces.tabuada;

public class TabuadaMultiplicacao implements tabuada{

    int fatorTabuada;

    public int getFatorTabuada() {
        return fatorTabuada;
    }

    public void setFatorTabuada(int fatorTabuada) {
        this.fatorTabuada = fatorTabuada;
    }

    public void mostrarTabuada(){
        System.out.println("- Tabuada do " + fatorTabuada);
        int segundoFator = 1;
        while (segundoFator <= 10){
            int produto = fatorTabuada * segundoFator;
            System.out.println(fatorTabuada + " x " + segundoFator + " = " + produto);
            segundoFator++;
        }
    }
}
