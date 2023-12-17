// Refer from code.io tamil channel

public class Recursion {
    public static void main(String[] args) {
        Natural_Print(10);
    }

    public static void Natural_Print(int n) {
        // Base Case
        if (n == 1) {
            System.out.println(1);
        }

        // Recursive Case
        else {
            System.out.println(n);
            Natural_Print(n -1);
        }
    }
}
