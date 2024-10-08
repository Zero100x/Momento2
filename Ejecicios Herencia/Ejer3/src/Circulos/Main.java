package Circulos;

public class Main {
    public static void main(String[] args) {
       
        Circulo circulo = new Circulo(5);
        Cilindro cilindro = new Cilindro(5, 10);
        CilindroHueco cilindroHueco = new CilindroHueco(5, 3, 10);

       
        System.out.println("Área del círculo: " + circulo.area());
        System.out.println("Circunferencia del círculo: " + circulo.circunferencia());

        System.out.println("Área lateral del cilindro: " + cilindro.areaLateral());
        System.out.println("Volumen del cilindro: " + cilindro.volumen());

        System.out.println("Área del cilindro hueco: " + cilindroHueco.area());
        System.out.println("Volumen del cilindro hueco: " + cilindroHueco.volumenHueco());
    }
}
