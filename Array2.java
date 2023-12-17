// Multi Dimensional Array

public class Array2 {
    public static void main(String[] args) {
        // Create the variable for array
        int[][] matrixNums = new int[5][2];

        matrixNums[0][1] = 1;
        matrixNums[0][0] = 2;
        matrixNums[4][1] = 5;

        // System.out.println(matrixNums[0][0]);

        // nested for loop
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println(matrixNums[i][j]);
            }
            System.out.println(" ");
        }
    }
}
