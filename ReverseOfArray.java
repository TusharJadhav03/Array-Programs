
import java.util.Scanner;

public class ReverseOfArray {

    static int reverseArray(int array[]){

        System.out.println("Reverse Array:");
        for(int i=array.length-1;i>=0;i--){
            System.out.println(array[i]);
        }
        return 1;   
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size = sc.nextInt();
        int array[] = new int[size];

        System.out.println("Enter a element in array:");
        for (int i = 0; i<size; i++) {
            array[i] = sc.nextInt();
        }

        System.out.println("Original array :");
        for(int i=0;i<size;i++){
            System.out.println(array[i]);
        }

        reverseArray(array);
        sc.close();
    }
}
