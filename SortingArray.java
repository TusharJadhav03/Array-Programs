
import java.util.*;

public class SortingArray {
    
    public static void main(String[] args) {
        
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the size of array:");
      int size = sc.nextInt();
      
      int array[] = new int[size];


      System.out.println("Enter elements of array: ");
      for(int i=0;i<size;i++){
        array[i] = sc.nextInt();
      }
      
      System.out.println("Print Array:");
      for(int i=0;i<size;i++){
        System.out.print(array[i]);
      }

      for(int i=0;i<size;i++){
        Arrays.sort(array);
      }

      for(int i=0;i<size;i++){
        System.out.println("Sorted Array is:" + array[i]);
      }

      for(int i=0;i<size;i++){

        for(int j=i+1;j<size;j++){

          if(array[i]<array[j]){
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
          }
        }
      }
      for(int i=0;i<size;i++){
        System.out.println(array[i]);
      }

      sc.close();

    }
}
