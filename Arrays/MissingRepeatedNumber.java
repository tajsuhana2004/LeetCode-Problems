/* Question Number 2965
Find Missing And Repeated Values


You are given a 0-indexed 2D integer matrix grid of size n * n with values in the range [1, n2]. 
Each integer appears exactly once except a which appears twice and b which is missing. 
The task is to find the repeating and missing numbers a and b.

Return a 0-indexed integer array ans of size 2 where ans[0] equals to a and ans[1] equals to b.

Example 1:

Input: grid = [[1,3],[2,2]]
Output: [2,4]
Explanation: Number 2 is repeated and number 4 is missing so the answer is [2,4].*/

public class MissingRepeatedNumber {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int N = n * n;
        Set<Integer> set = new HashSet<>();
        int a = -1, b = -1;
        long sum = 0;

        for (int[] row : grid) {
            for (int val : row) {
                sum += val;
                if (!set.add(val)) {
                    a = val; 
                }
            }
        }

        long expected = (long) N * (N + 1) / 2;
        b = (int)(expected - (sum - a)); 

        return new int[]{a, b};
    }
}
        
    
