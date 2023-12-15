class Calculator_3 {

    // Methods with Parameters
    public int Add(double x, double y) {
        int result;

        result = (int) (x + y);
        return result;
    }

    public int Add(int a, int b, int c) {
        return 0;
    }
    
}

public class CandObj {
    public static void main(String[] args) {
        int a, b, result;
        a = 10; 
        b = 5;

        // Create the object
        Calculator_3 my_calc = new Calculator_3();
        result = (int) my_calc.Add(a, b);

        System.out.println("Result : " + result);
    }
}
