//Question number:136
//Given a non-empty array of integers nums, every element appears twice except for one. 
// Find that single one.

//You must implement a solution with a linear runtime complexity and use only constant extra space.

//Example 1:
//Input: nums = [2,2,1]
//Output: 1

public class SingleNumber {
    public static int Single(int[] nums){
        int value=0;
        for(int i=0;i<nums.length;i++){
            value=value^nums[i];
        }
        return value;
    }
    public static void main(String args[]){
        int nums[]={2,2,1};
        System.out.println(Single(nums));
    }
    
}
