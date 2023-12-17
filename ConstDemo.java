// Java Constructor
public class ConstDemo {
    // Create the class Attribute
    int x;

    // Create a class constructor for the Main Class
    public ConstDemo() {
        x = 5;      // Set the initial value for the class attribute x
    }

    public static void main(String[] args) {
        ConstDemo myDemo = new ConstDemo();
        System.out.println("X : " +  myDemo.x);
    }
    
}