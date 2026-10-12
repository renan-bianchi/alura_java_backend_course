package br.com.alura.exercises.OO.interfaces.conversortemperatura;

public class ConversorTemperaturaPadrao implements ConversorTemperatura{

    double temperatura;
    int seletorFunc;

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public void setSeletorFunc(int seletorFunc) {
        this.seletorFunc = seletorFunc;
    }



    public void selecionaFunc(){
        if (seletorFunc == 1){
            celsiusParaFahrenheit();
        }
        else if (seletorFunc == 2){
            fahrenheitParaCelsius();
        }
        else
            System.out.println("Seleção inválida!");
    };

    public void celsiusParaFahrenheit(){
        double convResult = (temperatura * 1.8) + 32;
        System.out.println(temperatura + " é igual a " + convResult + " Fahrenheit.");
    };

    public void fahrenheitParaCelsius(){
        double convResult = (temperatura + 32) / 1.8 ;
        System.out.println(temperatura + "é igual a " + convResult + "Celsius");
    };
}
