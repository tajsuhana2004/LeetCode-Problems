/* Question 74:
You are given an m x n integer matrix matrix with the following two properties:

Each row is sorted in non-decreasing order.
The first integer of each row is greater than the last integer of the previous row.
Given an integer target, return true if target is in matrix or false otherwise.

You must write a solution in O(log(m * n)) time complexity.*/

 

public class Search2Dmatrix {
     
    public boolean SearchInRow(int[][] mat,int target,int row){
        int n=mat[0].length;
        int start=0,end=n-1;

        while(start<=end){
            int mid=start+(end-start)/2;
            if(target==mat[row][mid]){
                return true;
            }
            else if(target>mat[row][mid]){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return false;
    }
    public boolean searchMatrix(int[][] mat, int target) {
        
        //Binary Search on total rows
        int m=mat.length,n=mat[0].length;

        int startRow=0;
        int endRow=m-1;
        while(startRow<=endRow){
            int midRow=startRow+(endRow-startRow)/2;

            if(target>=mat[midRow][0] && target<=mat[midRow][n-1]){
                //found the Row calling the function
                return SearchInRow(mat,target,midRow);
            }
            else if(target>=mat[midRow][n-1]){
                //down => right
                startRow=midRow+1;

            }
            else{
                //up => left
                endRow=midRow-1;
            }
        }
        return false;

    }
}
    

