//Selection Sort
//Given an unsorted array of size N, use selection sort to sort arr[] in increasing order.

class Solution
{
	int  select(int arr[], int i)
	{
        // code here such that selectionSort() sorts arr[]
        return 0;
	}
	
	void selectionSort(int arr[], int n)
	{
	    //code here
	    for(int i = 0; i <= n-2; i++) {
	        int min = i;
	        for(int j = i; j <= n-1; j++) {
	            if(arr[j] < arr[min]) {
	                min = j;
	            }
	        }
	        
	        int temp = arr[i];
	        arr[i] = arr[min];
	        arr[min] = temp;
	    }
	}
}
