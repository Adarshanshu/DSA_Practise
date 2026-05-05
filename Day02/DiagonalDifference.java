package DSA_Practise.Day02;

import java.util.Scanner;

public class DiagonalDifference {
    // to find the diagonal difference we have to calculate the primary diagonal and secondary diagonal

    public static int difference(int matrix[][]){
        int n = matrix.length;
        int primaryDiagonal = 0;
        int secondaryDiagonal =0;
        for(int i=0;i<n;i++){
            primaryDiagonal += matrix[i][i];
            secondaryDiagonal +=  matrix[i][n-1-i];

        }
        return Math.abs(secondaryDiagonal - primaryDiagonal);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of the matrix which in nXn  ");
        int n = sc.nextInt();
        System.out.println("enter the elements of the array ");
        int matrix[][] = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<matrix[i].length;j++){
                matrix[i][j] = sc.nextInt();
            }      
        }
        int result = difference(matrix);
        System.out.println("absolute difference between the diagonals are  -> "+result);
        sc.close();

    }
    
}
