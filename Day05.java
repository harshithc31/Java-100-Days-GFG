# Remove duplicate elements from sorted Array
  class Solution {
    int remove_duplicate(int A[],int N){
        // code here
        int j = 1;
        for(int i = 1; i < N; i++) {
            if(A[i] != A[i-1]) {
                A[j] = A[i];
                j++;
            }
        }
        return j;
    }
}
