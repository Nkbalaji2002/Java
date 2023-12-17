// Formatting Date and Time
package Date_Time;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Demo3 {
    public static void main(String[] args) {
        LocalDateTime myDateTime = LocalDateTime.now();
        System.out.println("Before Formatting : " + myDateTime);
        
        DateTimeFormatter myFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        
        String formatted_Date = myDateTime.format(myFormatter);
        System.out.println("After Formatting : " + formatted_Date);
    }
}
