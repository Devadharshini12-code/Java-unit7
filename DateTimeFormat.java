// unit 7 Date,time format

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class DateTimeFormat {
    public static void main(String[] args) {

        LocalDateTime now=LocalDateTime.now();
       DateTimeFormatter format=DateTimeFormatter.ofPattern("yyyy-mm-dd  hh-mm-ss");

       String formattedDateTime=now.format(format);

    System.out.println("Formatted Date-Time:"+formattedDateTime);
        
    }
    
}
    
