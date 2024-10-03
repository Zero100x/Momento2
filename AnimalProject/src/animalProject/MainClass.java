package animalProject;

public class MainClass {
    public static void main(String[] args) {
        
        
        Cat cat = new Cat("Whiskers");
        System.out.println(cat);
        cat.greets();  
        
        
        Dog dog1 = new Dog("Rex");
        System.out.println(dog1);
        dog1.greets();  
        
     
        Dog dog2 = new Dog("Max");
        dog1.greets(dog2);  
    }
}

