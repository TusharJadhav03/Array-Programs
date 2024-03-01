// Find a peak element which is not smaller than its neighbours

// Example:

// Input: array[]= {5, 10, 20, 15}
// Output: 20
// Explanation: The element 20 has neighbors 10 and 15, both of them are less than 20.

import java.util.Scanner;

public class FindPeak {
    
    
    static int findaPeak(int arr[],int n){

        for(int i=1;i<n-1;i++){
            
            if(arr[i]>=arr[i-1] && arr[i]>=arr[i+1])
                return arr[i];

        }
        return 0;
        
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int []array = {10, 20, 15, 2, 23, 90, 67};
        int n = array.length;
        System.out.println(findaPeak(array, n));

        sc.close();
    }
}
