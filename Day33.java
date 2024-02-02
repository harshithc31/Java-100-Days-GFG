//Number of occurrence
//Given a sorted array Arr of size N and a number X, you need to find the number of occurrences of X in Arr.

class Solution {
    int count(int[] arr, int n, int x) {
        
        int l = 0;
        int r = n-1;
        int count = 0;
        
        while(l <= r) {
            if(arr[l] == x) {
                count++;
                l++;
            }
            else {
                l++;
            }
            if(arr[r] != x) {
                r--;
            }
        }
        return count;
        
    }
}
