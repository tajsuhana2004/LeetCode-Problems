/* Question Number 2150: Find the Lonely Numbers In Array

You are given an integer array nums. A number x is lonely when it appears only once, and no adjacent numbers (i.e. x + 1 and x - 1) appear in the array.

Return all lonely numbers in nums. You may return the answer in any order.

 

Example 1:

Input: nums = [10,6,5,8]
Output: [10,8]
Explanation: 
- 10 is a lonely number since it appears exactly once and 9 and 11 does not appear in nums.
- 8 is a lonely number since it appears exactly once and 7 and 9 does not appear in nums.
- 5 is not a lonely number since 6 appears in nums and vice versa.
Hence, the lonely numbers in nums are [10, 8].
Note that [8, 10] may also be returned.*/



    import java.util.*;

class Solution {
    public List<Integer> findLonely(int[] nums) {
        Arrays.sort(nums);
        List<Integer> list = new ArrayList<>();

        int n = nums.length;
        if (n == 1) {
            list.add(nums[0]);
            return list;
        }

        if (nums[0] + 1 < nums[1]) list.add(nums[0]);

        for (int i = 1; i < n - 1; i++) {
            if (nums[i-1] + 1 < nums[i] && nums[i] + 1 < nums[i+1]) {
                list.add(nums[i]);
            }
        }

        if (nums[n-2] + 1 < nums[n-1]) list.add(nums[n-1]);

        return list;
    }
}
    

