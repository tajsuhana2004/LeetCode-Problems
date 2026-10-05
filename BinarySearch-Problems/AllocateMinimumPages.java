/* Question Number:2064


You are given an integer n indicating there are n specialty retail stores. There are m product types of varying amounts, which are given as a 0-indexed integer array quantities, where quantities[i] represents the number of products of the ith product type.

You need to distribute all products to the retail stores following these rules:

A store can only be given at most one product type but can be given any amount of it.
After distribution, each store will have been given some number of products (possibly 0). Let x represent the maximum number of products given to any store. You want x to be as small as possible, i.e., you want to minimize the maximum number of products that are given to any store.
Return the minimum possible x.

 

Example 1:

Input: n = 6, quantities = [11,6]
Output: 3
Explanation: One optimal way is:
- The 11 products of type 0 are distributed to the first four stores in these amounts: 2, 3, 3, 3
- The 6 products of type 1 are distributed to the other two stores in these amounts: 3, 3
The maximum number of products given to any store is max(2, 3, 3, 3, 3, 3) = 3. */


public class AllocateMinimumPages {

    public int minimizedMaximum(int n, int[] quantities) {
        int l=1;
        int r=0;
        for(int q:quantities){
            r=Math.max(r,q);
        }
        int result=0;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(possibleToDistribute(mid,quantities,n)){
                result=mid;
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return result;
        
    }
    private boolean possibleToDistribute(int x,int[] quantities,int n){
        int storesNeeded=0;
        for(int q:quantities){
            storesNeeded+=(q+x-1)/x;
            if(storesNeeded>n){
                return false;
            }
        }
        return storesNeeded<=n;
    }
}
    

