public class Logical {

    public static void main(String[] args) {
        int x = 7, y = 5, a = 5, b = 9;
        boolean result;

        result = (x > y) && (a > b);
        System.out.println(result);

        result = (x < y) && (a < b);
        System.out.println(result);

        result = (x > y) || (a > b);
        System.out.println(result);

        result = (x < y) || (a < b);
        System.out.println(result);
    }
}