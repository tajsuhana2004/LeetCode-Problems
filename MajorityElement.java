// Question 169 : Given an array nums of size n, return the majority element.
/* The majority element is the element that appears more than ⌊n / 2⌋ times. 
  You may assume that the majority element always exists in the array.
Example 1:
Input: nums = [3,2,3]
Output: 3 */

public class MajorityElement {
    public static int Majority(int nums[]){
        int cand=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(count==0){
                cand=nums[i];
                count++;
            }
            else{
                count--;
            }
        }
        return cand;

    }
    
public static void main(String args[]){
    int nums[]={2,2,1,1,1,2,2};
    System.out.println(Majority(nums));
 }
}
