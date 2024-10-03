package animalProject;

public class Animal {
   
    protected String name;

    // Constructor
    public Animal(String name) {
        this.name = name;
    }

    
    @Override
    public String toString() {
        return "Animal[name=" + name + "]";
    }
}

