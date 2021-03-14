package JAVA.NEW;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
class formator
{
    public static void main( String args[])
    {
         LocalDateTime LocalDate=LocalDateTime.now();
        System.out.println("Before formatting: "+LocalDate);
        DateTimeFormatter formatobj;
        formatobj=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
         String formattedDate=LocalDate.format(formatobj);
        System.out.println("After Formatting: "+formattedDate);
    }
}