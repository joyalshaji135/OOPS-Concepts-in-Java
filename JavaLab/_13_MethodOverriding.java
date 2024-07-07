
class Animal {
   
    public void makeSound() {
        System.out.println("Some sound");
    }
}


class Dog extends Animal {
    
    @Override
    public void makeSound() {
        System.out.println("Bark Bark!");
    }

    
    public void fetch() {
        System.out.println("Fetching...");
    }
}

public class _13_MethodOverriding {
    public static void main(String[] args) {
        Animal genericAnimal = new Animal(); 
        Dog myDog = new Dog(); 

        genericAnimal.makeSound(); 
        myDog.makeSound(); 
        myDog.fetch(); 
    }
}
