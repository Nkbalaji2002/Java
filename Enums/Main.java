package Enums;

public class Main {
    enum Level {
        LOW, 
        MEDIUM,
        HIGH
    }

    public static void main(String[] args) {
        // object for Level enum
        Level myLevel = Level.MEDIUM;

        // switch statement
        switch (myLevel) {
            case LOW:
                System.out.println("Low Level");
                break;

            case MEDIUM:
                System.out.println("Medium Level");
                break;

            case HIGH:
                System.out.println("High Level");
                break;
        
            default:
                break;
        }
        
        // Loop through the enums
        for (Level myLevel2 : Level.values()) {
            System.out.println(myLevel2);
        }
    }
}
