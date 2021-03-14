package JAVA;

import java.util.Scanner;

public class bubbleshort {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        // Asking user number of integers to short
        System.out.println("Enter the number of integers to sort:");
        int n = scan.nextInt();
        // creating a array to store the integerrs that will be sorted
        int[] array = new int[n];
        // asking the userr r to enter the integers and storing them in array
        System.out.println("enter " + n + " integers: ");
        for (int i = 0; i < n; i++) {
            array[i] = scan.nextInt();
        }
        int swap;
        // sorting integers by ascending order
        for (int j = 0; j < n - 1; j++) {
            for (int z = 0; z < n - j - 1; z++) {
                if (array[z] > array[z + 1]) {
                    // use < to short by descending order
                    swap = array[z];
                    array[z] = array[z + 1];
                    array[z + 1] = swap;
                }
            }
        }
        // printing the integers after sorting
        System.out.println("sorted list of numbers: ");
        for (int y = 0; y < n; y++) {
            System.out.println(array[y]);
        }
        scan.close();
        
    }
}