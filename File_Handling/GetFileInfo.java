package File_Handling;

import java.io.File;

public class GetFileInfo {
    public static void main(String[] args) {
        File myFile = new File("File_Handling/fileName1.txt");

        if (myFile.exists()) {
            System.out.println("File Name : " + myFile.getName());
            System.out.println("Absolute Path : " + myFile.getAbsolutePath());
            System.out.println("Writable : " + myFile.canWrite());
            System.out.println("Readable : " + myFile.canRead());
            System.out.println("File size in bytes " + myFile.length());
        } else {
            System.out.println("The file does not exist.");
        }
        
    }
}
