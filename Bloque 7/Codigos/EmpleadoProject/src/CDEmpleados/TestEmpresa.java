package CDEmpleados;

public class TestEmpresa {
    public static void main(String[] args) {
        
        Coche cocheVendedor = new Coche("1234ABC", "Toyota", "Corolla");
        Coche cocheJefe = new Coche("5678XYZ", "BMW", "X5");

        
        Secretario secretario = new Secretario("Ana", "Lopez", "87654321B", "Calle Falsa 123", "555-1234", 25000, "Despacho 1", "123-4567");

        
        Vendedor vendedor = new Vendedor("Carlos", "Perez", "12345678A", "Avenida Real 456", "555-5678", 30000, cocheVendedor, "666-9876", "Zona Norte", 0.10);

        
        JefeDeZona jefe = new JefeDeZona("Luis", "Martinez", "98765432C", "Paseo Central 789", "555-9876", 50000, "Despacho 2", secretario, cocheJefe);

        
        vendedor.setSupervisor(jefe);

        
        secretario.incrementarSalario();
        vendedor.incrementarSalario();
        jefe.incrementarSalario();

        
        vendedor.darAltaCliente("Empresa ABC");

        
        jefe.darAltaVendedor(vendedor);

        
        System.out.println("---- Secretario ----");
        secretario.imprimir();

        System.out.println("\n---- Vendedor ----");
        vendedor.imprimir();

        System.out.println("\n---- Jefe de Zona ----");
        jefe.imprimir();
    }
}
