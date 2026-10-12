package br.com.alura.exercises.OO.interfaces.conversormoeda;
import br.com.alura.exercises.OO.interfaces.conversormoeda.ConversaoMonetaria;

public class ConversorMoeda implements ConversaoMonetaria {

    double valorDolar = 5.87;

    public double converterDolarParaReal(){
        return  valorDolar;

    };
}
