// Java Modifiers - Static

public class StaticDemo {
    // Static Method
    static void myStaticMethod() {
        System.out.println("Static methods can be called without creating objects");    
    }

    // Public Method
    public void myPublicMethod() {
        System.out.println("Public methods must be called by creating objects");
    }

    public static void main(String[] args) {
        myStaticMethod();

        StaticDemo myDemo = new StaticDemo();
        myDemo.myPublicMethod();
    }
}
