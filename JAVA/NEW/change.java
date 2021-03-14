package JAVA.NEW;

import java.util.Scanner;

public class change {
    public static void main(String args[]) {
        int a, b, c, sum;
        Scanner scan = new Scanner(System.in);
        try {
            System.out.println("Enter the vlues of a ,b,c: ");
            a = scan.nextInt();
            b = scan.nextInt();
            c = scan.nextInt();
            sum = a + b + c;
            int sum1 = sum - 1;
            System.out.println("the sum of 3 variables: " + sum1);
            String fname;
            String lname;
            fname = "shoaib ";
            lname = " mirza";
            System.out.println(fname + lname);
        } catch (Exception e) {
            e.printStackTrace();
        }
        scan.close();
    }
}