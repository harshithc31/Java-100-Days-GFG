//Smallest Positive missing number
//You are given an array arr[] of N integers. The task is to find the smallest positive number missing from the array.
//Note: Positive number starts from 1.

class Solution
{
    //Function to find the smallest positive number missing from the array.
    static int missingNumber(int arr[], int size)
    {
        // Your code here
        Arrays.sort(arr);
        int count = 1;
        for(int i = 0; i < size; i++) {
            if(arr[i] == count) {
                count++;
            }
        }
        return count;
    }
}
