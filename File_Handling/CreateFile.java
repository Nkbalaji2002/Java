package File_Handling;

import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) {
        try {
            File myFile = new File("File_Handling/fileName1.txt");

            if (myFile.createNewFile()) {
                System.out.println("file created " + myFile.getName());
            } else {
                System.out.println("File already exists.");
            }
            
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
