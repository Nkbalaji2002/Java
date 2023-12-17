package Inner_Class;

public class Main {
    public static void main(String[] args) {
        // Create the objects
        Demo myDemo = new Demo();
        
        Demo.InnerDemo myInner = myDemo.new InnerDemo();

        System.out.println(myInner.y + myDemo.x);
    }
}
