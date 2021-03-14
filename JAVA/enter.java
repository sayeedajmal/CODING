package JAVA;

import java.io.*;
import java.util.Scanner;

class enter {
    public static void main(String args[]) throws NumberFormatException, IOException {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Values of A,B,C,D,E AND F");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int d = input.nextInt();
        int e = input.nextInt();

        Float f = input.nextFloat();
        int sum = (int) (a + b + c + d + e + f);
        {
            if (c < f) {
                System.out.println("The 6th Value is Greater then the 3rd Value: ");
            } else {
                System.out.println("The 3rd Value is Greater then the 6th Value");
            }
        }

        System.out.println("The sum of 6 Numbers are::" + sum);
        input.close();
    }
}