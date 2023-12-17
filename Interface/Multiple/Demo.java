package Interface.Multiple;

public class Demo implements FirstInterface, SecondInterface {
    public void myMethod() {
        System.out.println("Some Text...");
    }
    
    public void myOtherMethod() {
        System.out.println("Some Other Text...");
    }
}