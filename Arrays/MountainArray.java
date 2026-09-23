/*Question Number 852
PEAK INDEX IN A MOUNTAIN ARRAY

You are given an integer mountain array arr of length n where the values increase to a peak element and then decrease.

Return the index of the peak element.
Your task is to solve it in O(log(n)) time complexity.

Example 1:

Input: arr = [0,1,0]
Output: 1 */

public class MountainArray {
    public int peakIndexInMountainArray(int[] arr) {
        int start=0,end=arr.length-1;

        while(start < end){
            int mid = start + (end-start)/2;
            if(arr[mid] < arr[mid+1]){
                start = mid + 1; 
            } else {
                end = mid; 
            }
        }
        return start;
    }
    
}
