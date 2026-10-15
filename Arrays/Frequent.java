/*Question 2190
  Most Frequent Number Following Key

You are given an integer Arraylist(Array) nums. You are also given an integer key, which is present in
nums.
For every unique integer target in nums, count the number of times target immediately follows
an occurrence of key in nums. In other words, count the number of indices i such that:
0 <= i <= nums.size() - 2,
nums.get(i) == key and,
nums.get(i+1) == target.
Return the target with the maximum count.
(Assumption - that the target with maximum count is unique.) */

class Solution {
    public int mostFrequent(int[] nums, int key) {
        int[] count = new int[1001]; // constraints 1 to 1000
        int max = 0, ans = -1;

        for(int i=0; i<nums.length-1; i++) {
            if(nums[i] == key) {
                count[nums[i+1]]++;
                if(count[nums[i+1]] > max) {
                    max = count[nums[i+1]];
                    ans = nums[i+1];
                }
            }
        }
        return ans;
    }
}



    
}
