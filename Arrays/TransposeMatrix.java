/* Question number 867
Given a 2D integer array matrix, return the transpose of matrix.

The transpose of a matrix is the matrix flipped over its main diagonal, switching the matrix's row and column indices.

Example 1:
Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
Output: [[1,4,7],[2,5,8],[3,6,9]] */

public class TransposeMatrix{
    public static int[][] matrix(int[] [] matrix){
        int numsRow=matrix.length;
        int numsCols=matrix[0].length;

        int numsRowTranspose=numsCols;
        int numsColsTranspose=numsRow;

        int Transpose[][]=new int[numsRowTranspose][numsColsTranspose];
        for(int i=0;i<numsRowTranspose;i++){
            for(int j=0;j<numsColsTranspose;j++){
                Transpose[i][j]=matrix[j][i];

            }
        }
        return Transpose;

    }
    public static void main(String args[]){
        int[][] matrix={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        System.out.println(matrix(matrix));

        int[][] result = matrix(matrix);
        for(int i=0; i<result.length; i++){
            for(int j=0; j<result[0].length; j++){
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
    
