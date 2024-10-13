package CDEmpleados;

import java.util.ArrayList;
import java.util.List;

public class JefeDeZona extends Empleado {
    private String despacho;
    private Secretario secretario;
    private List<Vendedor> vendedores;
    private Coche coche;

    public JefeDeZona(String nombre, String apellidos, String dni, String direccion, String telefono, double salario, String despacho, Secretario secretario, Coche coche) {
        super(nombre, apellidos, dni, direccion, telefono, salario);
        this.despacho = despacho;
        this.secretario = secretario;
        this.coche = coche;
        this.vendedores = new ArrayList<>();
    }

    public void darAltaVendedor(Vendedor vendedor) {
        vendedores.add(vendedor);
    }

    public void darBajaVendedor(Vendedor vendedor) {
        vendedores.remove(vendedor);
    }

    public void cambiarSecretario(Secretario secretario) {
        this.secretario = secretario;
    }

    public void cambiarCoche(Coche coche) {
        this.coche = coche;
    }

    public void incrementarSalario() {
        super.incrementarSalario(20);
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Despacho: " + despacho);
        System.out.println("Secretario: " + secretario.nombre);
        System.out.println("Coche: " + coche);
        System.out.println("Vendedores a cargo: " + vendedores.size());
        System.out.println("Puesto: Jefe de Zona");
    }
}

