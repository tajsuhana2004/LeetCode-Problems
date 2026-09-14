//Question 268: Given an array nums containing n distinct numbers in the range [0, n], 
// return the only number in the range that is missing from the array.
//Example 1:
//Input: nums = [3,0,1]
//Output: 2
//Explanation:
//n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 
//2 is the missing number in the range since it does not appear in nums.

public class MissingNumber{
    public static int MissingNumber(int nums[]){
        int n=nums.length;
        int actualsum=(n*(n+1))/2;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
        }
        int missing = actualsum-sum;
        return missing;
    }
    public static void main(String args[]){
        int nums[]={3,0,1};
        System.out.println(MissingNumber(nums));
    }
}