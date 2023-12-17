package Inner_Class.Method;

public class Main {
    public static void main(String[] args) {
        // Create the objects
        Demo myDemo = new Demo();
        Demo.InnerDemo myInnerDemo = myDemo.new InnerDemo();

        int result = myInnerDemo.myInnerMethod();
        System.out.println(result);
    }
}
