package JAVA.NEW;

import java.util.Scanner;

public class leapyear {
    public static void main( String args[])
    {
        int year;
         Scanner sc=new Scanner(System.in);
        try {
            System.out.println("Enter a Year to be checked");
            year=sc.nextInt();

            if(year% 400==0)
            {
                System.out.println(year +" is a Leap Year");
            }
            else
            {
                System.out.println(year +" is not a Leap Year.");
            }
        } catch (Exception e) {
            System.out.println("oops! : "+e.toString());
        }
        sc.close();
    }
}