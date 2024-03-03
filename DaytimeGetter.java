/**
 * Author: Majed
 * 
 * A Java class to retrieve the current date and time using LocalDateTime from the java.time package.
 * 
 * Bu Java sınıfı, java.time paketinden LocalDateTime kullanarak geçerli tarih ve saati almak için kullanılır.
 */

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DaytimeGetter {
    public static void main(String[] args) {
        // Get current date and time
        LocalDateTime currentTime = LocalDateTime.now();
        
        // Format the date and time
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = currentTime.format(formatter);
        
        // Print the formatted date and time
        System.out.println("Current date and time: " + formattedDateTime);
    }
}
