package JAVA;

import java.io.File;

class temprory {
    public static void main( String args[]) {
         String[] cars = { "Volvo", "BMW", "Ford" };
        /* Here 2 is deside that one car is appear */
        System.out.println(cars[2]);
         String s1 = "MY NAME IS SAYEED AJMAL. AND I AM COUNTING THE NUMBER OF WORDS.";
         String s2 = "testing. i am programing in vs code";
        System.out.println(s1.length());
        System.out.println(s1.toLowerCase());
        System.out.println(s1.concat(s2));
        System.out.println(s1.trim());
         int[][] show = { { 1, 2, 3, 4, 5, }, { 6, 7, 8, 9, 10 } };
        System.out.println(show);
        System.out.println("..............................");
        // creates a file object with specified path
         File file = new File("/we_are_testing");
        // tries to create a new directory
         boolean value = file.mkdir();
        if (value) {
            System.out.println("The new directory is created...");
        } else {
            System.out.println("the directory is already exist..");
        }
    }
}