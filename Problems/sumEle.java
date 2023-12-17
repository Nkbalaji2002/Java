// Calculate the sum of an Array
package Problems;

public class sumEle {
    public static void main(String[] args) {
        int[] myArray = {1, 4, 23, 6};
        int sum = 0;

        for (int i = 0; i < myArray.length; i++) {
            sum += myArray[i];  
        }

        System.out.println("The sum is " + sum);
    }
}
