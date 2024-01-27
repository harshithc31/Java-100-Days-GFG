# Find Transition Point
class Solution {
    int transitionPoint(int arr[], int n) {
        // code here
        if(arr[0]==1){
            return 0;
        }
        if(n==1){
            return -1;
        }
        
        int mid = n/2;
        if(arr[mid] == 1) {
            for(int i = 0; i <= mid; i++) {
                if(arr[i] == 1) {
                    return i;
                }
            }
        }
        
        if(arr[mid] == 0) {
            for(int i = mid; i < n; i++) {
                if(arr[i] == 1) {
                    return i;
                }
            }
        }
        
        return -1;

    }
}
