package CDpersonas;

public class Main {
    public static void main(String[] args) {

        Estudiante estudiante1 = new Estudiante("Juan", "Pérez", "12345", "Soltero", "Ingeniería");
        Estudiante estudiante2 = new Estudiante("Ana", "García", "67890", "Casada", "Arquitectura");

        Profesor profesor1 = new Profesor("Carlos", "López", "11223", "Divorciado", 2005, 101, "Matemáticas");

        PersonalServicio personal1 = new PersonalServicio("Marta", "Fernández", "33445", "Viuda", 2010, 202, "Biblioteca");

        estudiante1.imprimirInfo();
        System.out.println();
        estudiante2.imprimirInfo();
        System.out.println();
        profesor1.imprimirInfo();
        System.out.println();
        personal1.imprimirInfo();

        profesor1.cambiarDepartamento("Física");
        personal1.cambiarSeccion("Decanato");

        System.out.println("\n--- Después de los cambios ---");
        profesor1.imprimirInfo();
        personal1.imprimirInfo();
    }
}

