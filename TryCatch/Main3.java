package TryCatch;

public class Main3 {
    static void checkAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Access Denied - You must be at least 18 years old.");
        } else {
            System.out.println("Access Granted - You are old enough!");
        }
    }

    public static void main(String[] args) {
        checkAge(21);
        // checkAge(17);
    }
}
