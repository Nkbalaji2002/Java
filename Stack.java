class Calculator_3 {
    int num = 5;
    public int Add(int a, int b) {
        System.out.println("num : " + num);
        return a + b;
    }
}


public class Stack {
    public static void main(String[] args) {
        // Assign the variables 
        int result;

        // objects
        Calculator_3 myCalc = new Calculator_3();
        Calculator_3 myCalc2 = new Calculator_3();
        
        result = myCalc.Add(4, 5);
        myCalc.num = 49;

        System.out.println("Result for myCalc : " + result);

        System.out.println(myCalc.num);
        System.out.println(myCalc2.num);
    }
    
}