// Java Modifiers - Abstract

// Abstract Class
abstract class AbstractDemo {
    public String fname = "John";
    public int age = 23;
    public abstract void Study();
}

// Sub Class (inherit from Main)
class Student extends AbstractDemo {
    public int graduate_year = 2019;
    public void Study() {
        System.out.println("Studying all day long");
    }
}