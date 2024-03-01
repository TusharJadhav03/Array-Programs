import java.util.Scanner;

public class MultiplyTwoMatrices {

    static void  multiply(int[][] matrix1,int[][] matrix2, int n, int m){
        System.out.println("Matrix 1 is:");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(matrix1[i][j]);
            }   
        }
        System.out.println("\n Matrix 2 is:");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(matrix2[i][j]);
            }   
        }

       for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            int mul = matrix1[i][j] *  matrix2[i][j]; 
            System.out.println(mul);
        }
       } 
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns: ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int matrix1[][] = new int[n][m];
        int matrix2[][] = new int[n][m];
        System.out.println("Enter value of matrix 1:");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter value of matrix 2:");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix2[i][j] = sc.nextInt();
            }
        }
        multiply(matrix1, matrix2, n, m);
        sc.close();
    }
}