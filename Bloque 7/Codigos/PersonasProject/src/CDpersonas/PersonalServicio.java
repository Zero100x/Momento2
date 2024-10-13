package CDpersonas;

public class PersonalServicio extends Empleado {
    private String seccion;

    public PersonalServicio(String nombre, String apellidos, String id, String estadoCivil, int añoIncorporacion, int despacho, String seccion) {
        super(nombre, apellidos, id, estadoCivil, añoIncorporacion, despacho);
        this.seccion = seccion;
    }

    public void cambiarSeccion(String nuevaSeccion) {
        this.seccion = nuevaSeccion;
    }

    @Override
    public void imprimirInfo() {
        super.imprimirInfo();
        System.out.println("Sección: " + seccion);
    }
}

