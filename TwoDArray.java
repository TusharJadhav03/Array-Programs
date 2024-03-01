
import java.util.Scanner;

/**
 * TwoDArray
 */
public class TwoDArray {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value of row and columns : ");
        int row = sc.nextInt();
        int col = sc.nextInt();

        int [][] array = new int[row][col];

        System.out.println("Enter value in array :");

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                array[i][j] = sc.nextInt();
            }
        }

        System.out.println("The array is :");

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.println(+i+j+"");
            }
        }

        int x = sc.nextInt();

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(array[i][j] == x){
                    System.out.println(array[i][j]);
                }
            }
        }

        sc.close();
    }
}