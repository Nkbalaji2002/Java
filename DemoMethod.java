class Hello {
    // Class inside method without Parameters or arguments
    public void myMethod() {
        System.out.println("Hello World");
    }
}


public class DemoMethod {
    public static void main(String[] args) {
        // Create the new object for Hello class
        Hello myHello = new Hello();

        // indicate the obj function
        myHello.myMethod();
    }
}