package Circulos;

public class Circulo {
    protected double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double leerRadio() {
        return this.radio;
    }

    public double area() {
        return Math.PI * Math.pow(radio, 2);
    }

    public double circunferencia() {
        return 2 * Math.PI * radio;
    }
}

