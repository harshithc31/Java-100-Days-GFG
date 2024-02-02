//Sort an array of 0s, 1s and 2s
//Given an array of size N containing only 0s, 1s, and 2s; sort the array in ascending order.

class Solution {
    public static void sort012(int a[], int n) {
        // code here 
        int c0 = 0;
        int c1 = 0;
        int c2 = 0;
        for(int i = 0; i < n; i++) {
            if(a[i] == 0) {
                c0++;
            }
            else if(a[i] == 1) {
                c1++;
            }
            else if(a[i] == 2) {
                c2++;
            }
        }
        
        for(int j = 0; j < c0; j++) {
            a[j] = 0;
        }
        for(int k = c0; k < (c0+c1); k++) {
            a[k] = 1;
        }
        for(int l = (c0+c1); l < n; l++) {
            a[l] = 2;
        }
    }
}
