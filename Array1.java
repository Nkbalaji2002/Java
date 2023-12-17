public class Array1 {
    public static void main(String[] args) {
        int num[] = {5, 4, 2, 6};

        // access elements
        num[1] = 9;
        System.out.println("num[1] : " + num[1]);

        int nums[] = new int[4];
        nums[0] = 49;
        nums[1] = 36;
        nums[2] = 10;
        nums[3] = 89;

        for (int i = 0; i < 4; i++) {
            System.out.println("i : " + nums[i]);
        }
    }
}
