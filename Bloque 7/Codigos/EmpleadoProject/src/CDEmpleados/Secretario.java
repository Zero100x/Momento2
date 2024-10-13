package CDEmpleados;

public class Secretario extends Empleado {
    private String despacho;
    private String fax;

    public Secretario(String nombre, String apellidos, String dni, String direccion, String telefono, double salario, String despacho, String fax) {
        super(nombre, apellidos, dni, direccion, telefono, salario);
        this.despacho = despacho;
        this.fax = fax;
    }

    public void incrementarSalario() {
        super.incrementarSalario(5);
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Despacho: " + despacho);
        System.out.println("Fax: " + fax);
        System.out.println("Puesto: Secretario");
    }
}

