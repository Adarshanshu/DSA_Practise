package DSA_Practise.Day02;

public class diagonalSum {
    public static int sumofDiagonal(int matrix[][]){
        int n = matrix.length;
        int sum = 0;
        for(int i=0;i<n;i++){
            sum += matrix[i][i] + matrix[i][n-1-i];
        }
        // if the size of matrix is odd then 
        if(n%2==1){
            sum -= matrix[n/2][n/2];
        }
        return sum;
    }
    public static void main(String args[]){
        int matrix[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int result = sumofDiagonal(matrix);
        System.out.println(result);
    }
}
