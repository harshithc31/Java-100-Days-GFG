//Game of XOR
//Given an array A of size N. The value of an array is denoted by the bit-wise XOR of all elements it contains. Find the bit-wise XOR of the values of all subarrays of A.

class Solution {
    static int gameOfXor(int N , int[] A) {
        // code here
        if(N%2 == 0) {
            return 0;
        }
        int ans = 0;
        
        for(int i = 0; i < N; i += 2) {
            ans = ans ^ A[i];
        }
        return ans;
    }
}
