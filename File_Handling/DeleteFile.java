package File_Handling;

import java.io.File;

public class DeleteFile {
    public static void main(String[] args) {
        File myFile = new File("File_Handling/fileName1.txt");
        
        if (myFile.delete()) {
            System.out.println("Deleted the file : " + myFile.getName());
        } else {
            System.out.println("Failed to delete the file.");
        }
    }
}
