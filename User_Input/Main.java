package User_Input;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner myScanner = new Scanner(System.in)) {
            System.out.println("Enter User Name : ");

            String userName = myScanner.nextLine();
            System.out.println("Username is " + userName);
        }
    }
}
