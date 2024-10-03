package animalProject;

public class Cat extends Mammal {
    // Constructor
    public Cat(String name) {
        super(name);
    }

  
    public void greets() {
        System.out.println("Meow");
    }

    
    @Override
    public String toString() {
        return "Cat[" + super.toString() + "]";
    }
}

