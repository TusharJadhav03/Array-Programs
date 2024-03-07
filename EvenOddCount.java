package Bridgelabz;
import java.util.*;

/**
 * EvenOddCount
 */
public class EvenOddCount {

    public static void main(String args[]){

        int a[] = new int[10];
        int even_count=0;
        int odd_count=0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of array:");

        for(int i=0;i<a.length;i++){
            a[i] = sc.nextInt();
        }

        for(int i=0;i<a.length;i++){
            if(a[i]%2==0){
                even_count ++;
            }
            else{
                odd_count ++;
            }
        }
        sc.close();
        System.out.println("Even value is:"+even_count);
        System.out.println("Odd value is:"+odd_count);



    }
}





















