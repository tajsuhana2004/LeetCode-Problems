/* Question number:1572
Given a square matrix mat, return the sum of the matrix diagonals.

Only include the sum of all the elements on the primary diagonal and all the elements on the secondary diagonal that 
are not part of the primary diagonal.

Example :
Input: mat = [[1,2,3],
              [4,5,6],
              [7,8,9]]
Output: 25
Explanation: Diagonals sum: 1 + 5 + 9 + 3 + 7 = 25
Notice that element mat[1][1] = 5 is counted only once.
 */

public class DiagonalSum{
    public static int DiagonalSum(int mat[][]){
        int n=mat.length;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=mat[i][i];
            if(i!=n-1-i){
                sum+=mat[i][n-i-1];
            }
        }
        return sum;
    }
}