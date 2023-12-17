# Second Largest
  class Solution {
    int print2largest(int arr[], int n) {
        // code here
        int s_largest = -1;
        int largest = arr[0];
        
        for(int i = 1; i < n; i++) {
            if(arr[i] > largest) {
                s_largest = largest;
                largest = arr[i];
                
            }
            else if(arr[i] != largest && arr[i] > s_largest) {
                s_largest = arr[i];
            }
        }
        return s_largest;
    }
}
