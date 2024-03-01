

import java.util.Scanner;

public class Min_Max {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  the number of elements you want in array:");
        int size = sc.nextInt();

        int[] array = new int[size];

        System.out.println("Enter element in array: ");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt(); // input array
        }

        System.out.println("Array: ");
        for (int i = 0; i < size; i++) {
            System.out.print(" "+array[i]); // input array
        }

        int min = array[0];
        int max = array[0];

        for (int i = 0; i < size; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }

        }

        System.out.println("The minimum value in array is : " + min);
        System.out.println("The Maximum value in array is : " + max);
        sc.close();

    }
}
