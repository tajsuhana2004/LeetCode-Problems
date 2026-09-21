//Question 485: Given a binary array nums, return the maximum number of consecutive 1's in the array.
//Example 1:

//Input: nums = [1,1,0,1,1,1]
//Output: 3
//Explanation: The first two digits or the last three digits are consecutive 1s. 
//The maximum number of consecutive 1s is 3.

public class MaxConsecutiveOnes{
    public static int MaxConsecutiveOnes(int nums[]){
        int max=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                count++;
                max=Math.max(max,count);
            }
            else{
                count=0;
            }
        }
        return max;
    }
    public static void main(String args[]){
        int nums[]={1,1,0,1,1,1};
        System.out.println(MaxConsecutiveOnes(nums));

    }
}