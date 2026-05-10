public class Solution1{

    public static void swap(int matrix[][],int i ,int j){
        int temp = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = temp;
    }

    public static int[][]  transpose(int matrix[][]){
      // to find trnapose we have to itirate through the row and coloumn
      for(int i=0;i<matrix.length;i++){
        for(int j=0;j<=i;j++){
            swap(matrix,i,j);
        }
      }
      return matrix;
    }
    public static void main(String args[]){
        int matrix[][] = {{1,2,3},{4,5,6},{7,8,9}};
        matrix = transpose(matrix);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}