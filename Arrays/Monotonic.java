/* Question 896: Monotonic Array
An array is monotonic if it is either monotone increasing or monotone decreasing.

An array nums is monotone increasing if for all i <= j, nums[i] <= nums[j]. An array nums is monotone decreasing if for all i <= j, nums[i] >= nums[j].

Given an integer array nums, return true if the given array is monotonic, or false otherwise.

 

Example 1:

Input: nums = [1,2,2,3]
Output: true */

public class Solution {
    public boolean isMonotonic(int[] A){
        boolean inc = true;
        boolean dec = true;
        for(int i=0; i<A.length-1; i++){
            if(A[i] > A[i+1]){
                inc = false;
            }
            if(A[i] < A[i+1]){
                dec = false;
            }
        }
        return inc || dec;
    }
}