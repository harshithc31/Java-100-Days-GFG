//Kth smallest element
//Given an array arr[] and an integer K where K is smaller than size of array, the task is to find the Kth smallest element in the given array. It is given that all array elements are distinct.

//Note :-  l and r denotes the starting and ending index of the array.

class Solution{
    public static int kthSmallest(int[] arr, int l, int r, int k) 
    { 
        //Your code here
        int p=partition(arr,l,r);
        if(p>k-1){         
            return kthSmallest(arr,l,p-1,k);
        }
        else if(p<k-1){
            return kthSmallest(arr,p+1,r,k);        
        }
        else{
            return arr[p];
        }
    } 
    static int partition(int[] arr,int l,int h){
        
        int pivot=arr[h];
        int low=l;
        for(int i=l;i<=h;i++){
            if(arr[i]<=pivot){
                int temp=arr[low];
                arr[low]=arr[i];
                arr[i]=temp;
                low++;
            }
        }
        
        return low-1;
        
    }
}
