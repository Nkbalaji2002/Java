package Inheritance;

// Child class (SubClass)
public class Car extends Vehicle {
    private String modelName = "Mustang";

    public static void main(String[] args) {
        // Create the object
        Car myCar = new Car();
        
        myCar.Honk();

        System.out.println(myCar.brand + " - " + myCar.modelName);
    }
}
