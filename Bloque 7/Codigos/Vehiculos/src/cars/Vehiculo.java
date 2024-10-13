package cars;

public abstract class Vehiculo {
    protected String matricula;
    protected double velocidad;

    public Vehiculo(String matricula) {
        this.matricula = matricula;
        this.velocidad = 0.0;
    }

    public void acelerar(double incremento) {
        this.velocidad += incremento;
    }

    public String getMatricula() {
        return matricula;
    }

    public double getVelocidad() {
        return velocidad;
    }

    @Override
    public String toString() {
        return "Matricula: " + matricula + ", Velocidad: " + velocidad + " km/h";
    }
}
