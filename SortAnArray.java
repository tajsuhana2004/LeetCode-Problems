//Question 912
//Given an array of integers nums, sort the array in ascending order and return it.
//You must solve the problem without using any built-in functions in O(nlog(n)) time complexity 
// and with the smallest space complexity possible.
/*Example 1:

Input: nums = [5,2,3,1]
Output: [1,2,3,5]
Explanation: After sorting the array, the positions of some numbers are not changed 
(for example, 2 and 3), while the positions of other numbers are changed (for example, 1 and 5).*/

import java.util.Arrays;
public class SortAnArray {
    public int[] sortArray(int[] nums) {
        sort(nums, 0,nums.length-1);
        return nums;
    }
    private void merge(int[] nums,int left, int right, int mid){
        int n1=mid-left+1;
        int n2=right-mid;

        // temp variable
        int[] l=new int[n1];
        int[] r =new int[n2];

        for(int i=0;i<n1;i++){
            l[i]=nums[left+i];
        }
        for(int j=0;j<n2;j++){
            r[j]=nums[mid+j+1];
        }

        int i=0,j=0,k=left;
        while(i<n1 && j<n2){
            if(l[i]<=r[j]){
                nums[k]=l[i];
                i++;
            }
            else{
                nums[k]=r[j];
                j++;

            }
            k++;
        }
        while(i<n1){
            nums[k++]=l[i++];
        }
        while(j<n2){
            nums[k++]=r[j++];
        }
    }
    private void sort(int[] nums,int left, int right){
        if(left<right){
            int mid = left+(right-left)/2;
            sort(nums,left,mid);
            sort(nums,mid+1,right);
            merge(nums,left,right,mid);
        }
    }

    public static void main(String[] args) {
        SortAnArray sol = new SortAnArray();
        int[] nums = {5,2,3,1};
        System.out.println("Before: " + Arrays.toString(nums));
        int[] sorted = sol.sortArray(nums);
        System.out.println("After: " + Arrays.toString(sorted));
    }
}

