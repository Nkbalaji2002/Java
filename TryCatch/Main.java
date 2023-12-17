package TryCatch;

public class Main {
    public static void main(String[] args) {
        try {
            int[] myNumbers = {1, 3, 4, 6};
            System.out.println(myNumbers[10]);
        } catch (Exception e) {
            System.out.println("Something went wrong");
        }
    }
}
