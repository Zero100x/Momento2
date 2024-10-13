package CDpersonas;

public class Profesor extends Empleado {
    private String departamento;

    public Profesor(String nombre, String apellidos, String id, String estadoCivil, int añoIncorporacion, int despacho, String departamento) {
        super(nombre, apellidos, id, estadoCivil, añoIncorporacion, despacho);
        this.departamento = departamento;
    }

    public void cambiarDepartamento(String nuevoDepartamento) {
        this.departamento = nuevoDepartamento;
    }

    @Override
    public void imprimirInfo() {
        super.imprimirInfo();
        System.out.println("Departamento: " + departamento);
    }
}

