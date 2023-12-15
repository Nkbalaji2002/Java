public class Assignment {
    public static void main(String[] args) {
        int a = 9, b = 4, result;

        result = a + b;
        System.out.println("Addtion : " + result);

        result = a - b;
        System.out.println("Subtraction : " + result);

        result = a * b;
        System.out.println("Multiplication : " + result);

        result = a / b;
        System.out.println("Division : " + result);

        result = a % b;
        System.out.println("Modulus : " + result);

        // Pre Increment
        System.out.println(++a);

        // Post Increment
        System.out.println(a++);

        // Pre Decrement
        System.out.println(--b);

        // Post Increment
        System.out.println(b--);
    }
}
