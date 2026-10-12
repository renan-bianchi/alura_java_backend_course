package br.com.alura.exercises.OO.interfaces.calculadoradimensoesretangulo;

public class CalculadoraSalaRetangular implements CalculoGeometrico{

    private int base;
    private int altura;


    public int calcularArea(){
        return this.base * this.altura;
    }

    public int calcularPerimetro(){
        return (this.base + this.altura) * 2;
    }


    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
}
