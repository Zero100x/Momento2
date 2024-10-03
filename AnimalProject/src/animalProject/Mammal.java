package animalProject;

public class Mammal extends Animal {
    // Constructor
    public Mammal(String name) {
        super(name); 
    }

   
    @Override
    public String toString() {
        return "Mammal[" + super.toString() + "]";
    }
}

