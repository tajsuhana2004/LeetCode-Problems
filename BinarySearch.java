//Question 704: Given an array of integers nums which is sorted 
// in ascending order, and an integer target, 
// write a function to search target in nums. If target exists, then return its index. Otherwise, return -1.

public class BinarySearch{
    public static int binarysearch(int nums[],int target){
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=(start+end)/2;

            //Comparison
            if(nums[mid]==target){
                return mid;
            }
            if(nums[mid]< target){
                start=mid+1;// right(Second Half)
            }
            else{
                if(nums[mid]>target){
                    end=mid-1;//left side (First Half)
                }
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int nums[]={-1,0,3,5,9,12};
        int target=9;
        System.out.println("The target is:" + binarysearch(nums,target));
    }
}