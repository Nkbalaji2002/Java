class Calculator_3 {
    public int Add(int a, int b, int c) {
        return a + b + c;
    }

    public double Add(double a, double b) {
        return a + b;        
    }
}


public class MethodOverloading {
    public static void main(String[] args) {
        // create the variable
        int a, b, c, result;
        double x, y, result2;

        // Assign the variable value
        a = 39;
        b = 95;
        c = 59;
        
        x = 93.29;
        y = 48.92;

        // create the object
        Calculator_3 myCalc = new Calculator_3();

        result = myCalc.Add(a, b, c);
        System.out.println("Result-1 : " + result);
        
        result2 = myCalc.Add(x, y);
        System.out.println("Result-2 : " + result2); 
    }
}
