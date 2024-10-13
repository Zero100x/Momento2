package CDpersonas;

public class Persona {
    protected String nombre;
    protected String apellidos;
    protected String id;
    protected String estadoCivil;

    public Persona(String nombre, String apellidos, String id, String estadoCivil) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.id = id;
        this.estadoCivil = estadoCivil;
    }

    public void cambiarEstadoCivil(String nuevoEstado) {
        this.estadoCivil = nuevoEstado;
    }

    public void imprimirInfo() {
        System.out.println("Nombre: " + nombre + " " + apellidos);
        System.out.println("ID: " + id);
        System.out.println("Estado Civil: " + estadoCivil);
    }
}

