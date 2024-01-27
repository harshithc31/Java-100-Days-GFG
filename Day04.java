# Product array puzzle
class Solution 
{ 
	public static long[] productExceptSelf(int nums[], int n) 
	{ 
        // code here
        
        long P[] = new long[n];
        long product = 1;
        int zeroCount = 0;
        int zIndex = -1;
        
        for(int i = 0; i < n; i++) {
            if(nums[i] == 0) {
                zeroCount++;
                zIndex = i;
            }
            else {
                product *= nums[i];
            }
        }
        
        if(zeroCount > 1) {
            return P;
        }
        
        if(zeroCount == 0) {
            for(int j = 0; j < n; j++) {
                P[j] = product / nums[j];
            }
        } 
        else {
            P[zIndex] = product;
        }        
        return P;
	} 
} 
