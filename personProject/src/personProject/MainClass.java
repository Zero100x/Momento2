package personProject;

public class MainClass {
    public static void main(String[] args) {
     
        Person persona = new Person("Juan Perez", "Calle Principal 123");
        System.out.println(persona);

       
        Student estudiante = new Student("Ana Lopez", "Avenida Universidad 456", "Ingeniería Informática", 2, 15000.00);
        System.out.println(estudiante);

        
        Staff empleado = new Staff("García", "Calle Universidad 789", "Facultad de Ingeniería", 50000.00);
        System.out.println(empleado);
    }
}

