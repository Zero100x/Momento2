package CDpersonas;

public class Estudiante extends Persona {
    private String curso;

    public Estudiante(String nombre, String apellidos, String id, String estadoCivil, String curso) {
        super(nombre, apellidos, id, estadoCivil);
        this.curso = curso;
    }

    public void matricularCurso(String nuevoCurso) {
        this.curso = nuevoCurso;
    }

    @Override
    public void imprimirInfo() {
        super.imprimirInfo();
        System.out.println("Curso: " + curso);
    }
}
