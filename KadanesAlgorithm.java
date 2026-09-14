//Question number:53 Maximum sum array
//Given an integer array nums, find the subarray with the largest sum, and return its sum.

public class KadanesAlgorithm {
    public static void Kadanes(int number[]){
        int cs=0;
        int ms=Integer.MIN_VALUE;
        for(int i=0;i<number.length;i++){
            cs=cs+number[i];
            ms=Math.max(cs,ms);
            if(cs<0){
                cs=0;
            }
        }
         System.out.println("The sum of subarray is:"+ ms);
    }
    public static void main(String args[]){
        int number[]={-2,1,-3,4,-1,2,-5,4};
        Kadanes(number);
    }
    
}
