package TryCatch;

public class Main2 {
    public static void main(String[] args) {
        try {
            int[] myNumbers = {39, 29, 5};
            System.out.println(myNumbers[10]);
        } catch (Exception e) {
            System.out.println("something went wrong");
        } finally {
            System.out.println("The 'try-catch' is finished");
        }
    }
}
