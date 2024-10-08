package Circulos;

public class Cilindro extends Circulo {
    protected double altura;

    public Cilindro(double radio, double altura) {
        super(radio);
        this.altura = altura;
    }

    public double volumen() {
        return area() * altura;
    }

    public double areaLateral() {
        return circunferencia() * altura;
    }
}

