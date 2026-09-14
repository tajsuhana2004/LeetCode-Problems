// Question 42: Given n non-negative integers representing an elevation map where the width of each bar is 1, 
// compute how much water it can trap after raining.

public class TrappingRainwater {
    public static int Rainwater(int height[]){
        int n= height.length;
        int width=1;

        //calculate leftmax boundary
        int leftmax[]=new int [n];
        leftmax[0]= height[0];
        for(int i=1;i<n;i++){
            leftmax[i]=Math.max(height[i],leftmax[i-1] );

        }

        //calculate rightmax boundary
        int rightmax[] = new int [n];
        rightmax[n-1]= height[n-1];
        for(int i=n-2;i>=0;i--){
            rightmax[i]=Math.max(height[i],rightmax[i+1] );

        } 
        int Trappedwater=0;
        for(int i=0;i<n;i++){
             //water level
            int waterlevel=Math.min(leftmax[i],rightmax[i]);
            //Trapped water
        Trappedwater += ((waterlevel-height[i])*width);
        }
        
        return Trappedwater;
    }
    
public static void main(String args[]){
    int height[]= {0,1,0,2,1,0,1,3,2,1,2,1};
    System.out.println(Rainwater(height));
}
}
