package Inner_Class.Static;

public class Main {
    public static void main(String[] args) {
        // Create the objects
        Demo myDemo = new Demo();
        Demo.InnerDemo myInnerDemo = new Demo.InnerDemo();

        System.out.println("myDemo : " + myDemo.x);
        System.out.println("myInnerDemo : " + myInnerDemo.y);
        System.out.println("Result : " + (myDemo.x + myInnerDemo.y));
    }
}
