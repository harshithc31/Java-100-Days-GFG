//Largest Sum Subarray of Size at least K
//Given an array a of length n and a number k, find the largest sum of the subarray containing at least k numbers. It is guaranteed that the size of array is at-least k.

class Solution {
    
    public long maxSumWithK(long a[], long n, long k) {
        
        int N = (int)n;
        int K = (int)k;
        
        // sumNow -> sum till index i
        // sumK -> sum from i+k to last
        // minK -> min from i+k to last
        long sumNow = 0, sumK = 0;
        long minK = 0;
        
        // res -> stores the maximum sum of len k
        long res = Integer.MIN_VALUE;
        
        for(int i=N-1; i>=0; --i) {
            
            // adding current value to the sum
            sumNow += a[i];
            
            // if we can't make a subarray of len k from here, just continue;
            if(i > N-K)
                continue;
            
            // if we can make a subarray, start calculating
            sumK += (i+K < N ? a[i+K] : 0);
            minK = Math.min(minK, sumK);
            
            // maximum sum from here = sum from i to i+k-1 + maximum from i+k-1 to last
            long maxSumFromHere = sumNow-sumK + Math.max(0, sumK-minK);
            
            // if maxSumFromHere is greater than res, this is maxSum now
            res = Math.max(res, maxSumFromHere);
        }
        
        return res;
    }
}
