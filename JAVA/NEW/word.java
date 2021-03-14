package JAVA.NEW;

import java.util.Scanner;

public class word {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        try {
            System.out.println("Enter the vlues of a ,b,c: ");
            int a = scan.nextInt();
            int b = scan.nextInt();
            int c = scan.nextInt();
            if (a > b && a > c) {
                System.out.println("The Integer A is Large....   " + a);
            } else if (b > a && b > c) {
                System.out.println("The Interger B is Large...  " + b);
            } else {
                System.out.println("The Integer C is Large..    " + c);
            }
            int sum = a + b + c;
            System.out.print("Sum of " + a + "\t" + b + "\t" + c + "\t" + " Integers are : " + sum);
        } catch (Exception e) {
            e.printStackTrace();
        }
        scan.close();
    }
}