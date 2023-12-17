package File_Handling;

import java.io.FileWriter;

public class writeFile {
    public static void main(String[] args) {
        try {
            FileWriter myWriter = new FileWriter("File_Handling/fileName1.txt");
            myWriter.write("Files in Java might be tricky, but it is fun enough!");
            myWriter.close();
            System.out.println("Successfully wrote to the file");
        } catch (Exception e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
