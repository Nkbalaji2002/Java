// How to Reverse a String
package Problems;

public class Reverse {
    public static void main(String[] args) {
        String originalString = "Hello";
        String reversedString = "";

        for (int i = 0; i < originalString.length(); i++) {
            reversedString = originalString.charAt(i) + reversedString;
        }

        System.out.println("Reversed String : " + reversedString);
    }
}
