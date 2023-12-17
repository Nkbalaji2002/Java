public class AbstractMain {
    public static void main(String[] args) {
        // Create the object
        Student myObj = new Student();
        
        System.out.println("Name : " + myObj.fname);
        System.out.println("Age : " + myObj.age);
        System.out.println("Graduation Year : "  + myObj.graduate_year);

        myObj.Study();
    }
}
