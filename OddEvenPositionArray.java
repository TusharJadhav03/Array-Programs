
import java.util.*;
/**
 * OddEvenPositionArray
 */
public class OddEvenPositionArray {

    
    public static void main(String[] args) {
        
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size = sc.nextInt();

        String[] array = new String[size];

        System.out.println("Enter elements in array: ");
        for(int i=0;i<size;i++){
            array[i] = sc.nextLine();
        }

        System.out.println("Array of elements is:");
        for(int i=0;i<size;i++){
            System.out.println(array[i]);
        }
        for(int i=0;i<size;i+=2){
            System.out.println("Even Position in array is: "+array[i]);
        }

        for(int i=1;i<size;i+=2){
            System.out.println("Odd Position in array is: "+array[i]);
        }

       


        sc.close();
        
    }
}