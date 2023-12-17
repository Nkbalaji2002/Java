package Polymorphism;

public class Main {
    public static void main(String[] args) {
        // Create the objects for animal, cat, dog
        Animal myAnimal = new Animal();
        Animal myCat = new Cat();
        Animal myDog = new Dog();
        
        // Methods
        myAnimal.animalSound();
        myCat.animalSound();
        myDog.animalSound(); 
    }
}
