//Kadane's Algorithm
//Given an array Arr[] of N integers. Find the contiguous sub-array(containing at least one number) which has the maximum sum and return its sum.

class Solution{

    // arr: input array
    // n: size of array
    //Function to find the sum of contiguous subarray with maximum sum.
    long maxSubarraySum(int arr[], int n){
        
        // Your code here
        long sum = 0;      //Kadane's Algo
        long max = Long.MIN_VALUE;
        for(int i = 0; i < n; i++) {
            sum += arr[i];
            if(sum > max) {
                max = sum;
            }
            if(sum < 0) {
                sum = 0;
            }
        }
        return max;
    }
}
