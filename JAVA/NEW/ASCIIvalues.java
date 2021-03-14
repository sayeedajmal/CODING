package JAVA.NEW;

import java.util.Scanner;
public class ASCIIvalues 
{
    public static void main(String args[]) 
    {
        Scanner scan=new Scanner(System.in);
        char c; 
        do{
            //reading a character
            System.out.println("Enter a Charcter: ");
            char chr=scan.next().charAt(0);
            //printing the ascii value of the character
            System.out.println("The ascii value of "+chr+" is: "+(int)chr);
            //press y to continue
            System.out.print("Do you want to continue? (y/n):");
            c=scan.next().charAt(0);
        }while(c=='y');
        scan.close();
    }
}