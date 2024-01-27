//First Repeating Element
//Given an array arr[] of size n, find the first repeating element. The element should occur more than once and the index of its first occurrence should be the smallest.
//Note:- The position you return should be according to 1-based indexing.

class Solution {
    // Function to return the position of the first repeating element.
    public static int firstRepeated(int[] arr, int n) {
        // Your code here
       
        int ans = Integer.MIN_VALUE;;
        for(int i=0;i<n;i++) {
            ans = Math.max(ans,arr[i]);
        }
        
        int[] a = new int[ans+1];
        
        for(int i=0;i<n;i++) {
            a[arr[i]]++;
        } 
        
        for(int i=0;i<n;i++) {
            if(a[arr[i]]>1) {
                return i+1;
            }
        }
        return -1;
    }
}
