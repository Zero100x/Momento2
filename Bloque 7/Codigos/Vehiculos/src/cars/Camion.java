package cars;

public class Camion extends Vehiculo {
    private Remolque remolque;

    public Camion(String matricula) {
        super(matricula);
        this.remolque = null;
    }

    public void ponRemolque(Remolque remolque) {
        this.remolque = remolque;
    }

    public void quitaRemolque() {
        this.remolque = null;
    }

    @Override
    public void acelerar(double incremento) {
        super.acelerar(incremento);
        if (remolque != null && velocidad > 100) {
            System.out.println("¡Advertencia! La velocidad con remolque supera los 100 km/h.");
        }
    }

    @Override
    public String toString() {
        String info = super.toString();
        if (remolque != null) {
            info += ", " + remolque.toString();
        }
        return info;
    }
}

