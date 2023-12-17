package Packages;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        try (// Create the object
        Scanner myScanner = new Scanner(System.in)) {
            String userName;

            // Enter username and Press Enter
            System.out.println("Enter User Name : ");
            userName = myScanner.nextLine();

            System.out.println("Username is " + userName);

        }
    }
}
