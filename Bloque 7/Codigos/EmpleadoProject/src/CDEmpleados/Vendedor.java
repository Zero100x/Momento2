package CDEmpleados;

import java.util.ArrayList;
import java.util.List;

public class Vendedor extends Empleado {
    private Coche coche;
    private String movil;
    private String areaVenta;
    private List<String> clientes;
    private double comision;

    public Vendedor(String nombre, String apellidos, String dni, String direccion, String telefono, double salario, Coche coche, String movil, String areaVenta, double comision) {
        super(nombre, apellidos, dni, direccion, telefono, salario);
        this.coche = coche;
        this.movil = movil;
        this.areaVenta = areaVenta;
        this.setComision(comision);
        this.clientes = new ArrayList<>();
    }

    public void darAltaCliente(String cliente) {
        clientes.add(cliente);
    }

    public void darBajaCliente(String cliente) {
        clientes.remove(cliente);
    }

    public void cambiarCoche(Coche coche) {
        this.coche = coche;
    }

    public void incrementarSalario() {
        super.incrementarSalario(10);
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Área de venta: " + areaVenta);
        System.out.println("Teléfono móvil: " + movil);
        System.out.println("Coche: " + coche);
        System.out.println("Clientes: " + clientes);
        System.out.println("Puesto: Vendedor");
    }

	public double getComision() {
		return comision;
	}

	public void setComision(double comision) {
		this.comision = comision;
	}
}

