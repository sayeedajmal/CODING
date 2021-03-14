package JAVA.NEW;


import java.util.Scanner;

public class sa {
    public static void main(String args[]) {
        Scanner test = new Scanner(System.in);
        int num;
        do {
            System.out.println("Enter the Value: ");
            num = test.nextInt();
            if (num % 2 == 0) {
                System.out.println("The given value is Even!");

            } else {
                System.out.println("Then given value is Odd..");
            }
            System.out.print("Do you want to continue? (Y/N):");
            num = test.next().charAt(0);
        } while (num == 'Y');
        test.close();
    }
}