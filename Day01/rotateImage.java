public class rotateImage {

    public static void swap(int matrix[][],int i,int j){
        int temp = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = temp;
    }

    public static int[][] rotate(int matrix[][]){
        //trnaspose
        int n= matrix.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                swap(matrix,i,j);
            }
        }
        // revrse each row to get the answer 
        for(int i=0;i<n;i++){
            int left =0;
            int right = n-1;
            while(left<right){
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
                left++;
                right--;
            }
           
        }
         return matrix;
    }
    public static void main(String args[]){
        int matrix[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int n = matrix.length;
         matrix = rotate(matrix);
         for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
         }
    }
}
