package JAVA;
import java.util.Scanner;

class temp {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the integers to be sorting:");
         int n = scan.nextInt();
         int[] array;
        array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scan.nextInt();
        }
        int swap;
        {
            for (int j = 0; j < n - 1; j++) {
                for (int z = 0; z < n - j - 1; z++) {
                    swap = array[z];
                    array[z] = array[z + 1];
                    array[z + 1] = swap;
                }
            }
        }
        System.out.println("sorted list of numbers are::");
        for (int y = 0; y < n; y++) {
            System.out.println(array[y]);
        }
        scan.close();
    }
}