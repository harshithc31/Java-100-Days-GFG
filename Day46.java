//Find element occuring once when all other are present thrice
//Given an array of integers arr[] of length N, every element appears thrice except for one which occurs once.
//Find that element which occurs once.

class Solution {
    static int singleElement(int[] arr , int N) {
        // code here
        int[] bits = new int[32];
        int ans = 0;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 32; j++) {
                if ((arr[i] & (1 << j)) != 0) {
                    bits[j]++;
                }
            }
        }

        for (int j = 0; j < 32; j++) {
            if (bits[j] % 3 != 0) {
                ans |= (1 << j);
            }
        }

        return ans;
    }
}
