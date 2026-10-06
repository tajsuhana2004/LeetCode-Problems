/* Question Number 287

Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.

There is only one repeated number in nums, return this repeated number.

You must solve the problem without modifying the array nums and using only constant extra space.

Example 1:

Input: nums = [1,3,4,2,2]
Output: 2 */

public class DuplicateNumbers {

    public int findDuplicate(int[] nums) {
        int low = 1;
        int high = nums.length - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;
            int count = 0;

            // count numbers <= mid
            for (int num : nums) {
                if (num <= mid) count++;
            }

            // If count > mid, duplicate is in [low, mid]
            if (count > mid) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
}
        
    

    

