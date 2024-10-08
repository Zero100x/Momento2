package Circulos;

public class CilindroHueco extends Cilindro {
    private double radioInterno;

    public CilindroHueco(double radioExterno, double radioInterno, double altura) {
        super(radioExterno, altura);
        this.radioInterno = radioInterno;
    }

    @Override
    public double area() {
        return Math.PI * (Math.pow(super.radio, 2) - Math.pow(radioInterno, 2));
    }

    public double volumenHueco() {
        return Math.PI * (Math.pow(super.radio, 2) - Math.pow(radioInterno, 2)) * super.altura;
    }
}

