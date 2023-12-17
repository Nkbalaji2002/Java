// How to count words
package Problems;

public class Count {
    public static void main(String[] args) {
        String words = "One Two Three Four Five";

        int count_Words = words.split("\\s").length;
        System.out.println("Count the words : " + count_Words );
    }
}
