/* Question Number 932: Beautiful Array
   
   An array nums of length n is beautiful if:
nums is a permutation of the integers in the range [1, n].
For every 0 <= i < j < n, there is no index k with i < k < j where 2 * nums[k] == nums[i] + nums[j].
Given the integer n, return any beautiful array nums of length n. There will be at least one valid answer for the given n.

Example 1:

Input: n = 4
Output: [2,1,4,3] */

import java.util.ArrayList;

    class Solution {
    public int[] beautifulArray(int n) {
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(1);

        while (ans.size() < n) {
            ArrayList<Integer> temp = new ArrayList<>();
            for (int x : ans) {
                if (2 * x - 1 <= n) {
                    temp.add(2 * x - 1);
                }
            }
            for (int x : ans) {
                if (2 * x <= n) {
                    temp.add(2 * x);
                }
            }
            ans = temp;
        }

        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            res[i] = ans.get(i);
        }
        return res;
    }
}
    

