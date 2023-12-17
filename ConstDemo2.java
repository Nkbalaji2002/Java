// Java Constructor Parameter

public class ConstDemo2 {
    String modelName;
    int modelAge;

    public ConstDemo2(int age, String name) {
        modelAge = age;
        modelName =  name;
    }

    public static void main(String[] args) {
        ConstDemo2 myDemo2 = new ConstDemo2(21, "Nithish kumar");
        // System.out.println("x : " + myDemo2.x);

        System.out.println(myDemo2.modelName + " - " + myDemo2.modelAge);
    }
}
