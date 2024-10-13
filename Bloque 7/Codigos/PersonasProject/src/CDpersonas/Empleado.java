package CDpersonas;

public class Empleado extends Persona {
    protected int añoIncorporacion;
    protected int despacho;

    public Empleado(String nombre, String apellidos, String id, String estadoCivil, int añoIncorporacion, int despacho) {
        super(nombre, apellidos, id, estadoCivil);
        this.añoIncorporacion = añoIncorporacion;
        this.despacho = despacho;
    }

    public void reasignarDespacho(int nuevoDespacho) {
        this.despacho = nuevoDespacho;
    }

    @Override
    public void imprimirInfo() {
        super.imprimirInfo();
        System.out.println("Año de Incorporación: " + añoIncorporacion);
        System.out.println("Despacho: " + despacho);
    }
}

