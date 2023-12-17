// refer from Code.io tamil channel
class Appform {
    String name;
    int rollno;

    public void Display() {
        System.out.println("Name : " + name);
        System.out.println("RollNo : " + rollno);
    }
}

public class ClassObj {
    public static void main(String[] args) {
        // Create the object
        Appform myAppform = new Appform();
        
        // Assign the variable values
        myAppform.name = "Nithish kumar";
        myAppform.rollno = 20;

        // display the method function
        myAppform.Display();
    }
}
