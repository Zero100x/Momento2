package cars;

public class SimuladorVehiculos {
    public static void main(String[] args) {
        Coche coche = new Coche("ABC-1234", 4);
        Camion camion = new Camion("XYZ-5678");
        Remolque remolque = new Remolque(2000);

        System.out.println(coche.toString());
        coche.acelerar(50);
        System.out.println("Después de acelerar: " + coche.toString());

        System.out.println();

        System.out.println(camion.toString());
        camion.acelerar(80);
        System.out.println("Después de acelerar: " + camion.toString());

        camion.ponRemolque(remolque);
        System.out.println("Camión con remolque: " + camion.toString());
        camion.acelerar(30);
        System.out.println("Después de acelerar con remolque: " + camion.toString());
    }
}

