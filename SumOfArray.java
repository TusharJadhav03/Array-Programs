import java.util.Scanner;

public class SumOfArray {

    static void SumArray(int arr[],int size){

        int sum = 0;
        for(int i=0;i<size;i++){
            sum = sum + arr[i];
            
        }
        System.out.println(sum);
        
    }
    

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int size = sc.nextInt();
        int array[] = new int[size];

        System.out.println("Enter element in array");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("The Array of sum is :");
        
        SumArray(array, size);
        sc.close();

    }
}
