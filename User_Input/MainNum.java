package User_Input;

import java.util.Scanner;

public class MainNum {
    public static void main(String[] args) {
        try (Scanner myScanner = new Scanner(System.in)) {
            System.out.println("Enter the Name, Age, and Salary");

            // String Input
            String name = myScanner.nextLine();

            // Numeric Input
            int age = myScanner.nextInt();
            double salary = myScanner.nextDouble();

            // Output by user input
            System.out.println("Name : " + name);
            System.out.println("Age : " + age);
            System.out.println("Salary : " + salary);
        }
    }
}
