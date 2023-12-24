// Count Inversions
class Solution
{
    // arr[]: Input Array
    // N : Size of the Array arr[]
    //Function to count inversions in the array.
    static long inversionCount(long arr[], long N)
    {
        // Your Code Here
        long low = 0;
        long high = N-1;
        return inv(arr,low,high);
        /////////////////////////////
        // long count = 0;        //Runtime Error 
        // for(int i = 0; i < N; i++) {
        //     for(int j = i+1; j < N; j++) {
        //         if(arr[i] > arr[j]) {
        //             count++;
        //         }
        //     }
        // }
        // return count;
    }
    public static long inv(long arr[], long low, long high){
        long res = 0;
        if(high>low){
            long mid = (low+high)/2;
            res +=inv(arr, low, mid);
            res +=inv(arr,mid+1,high);
            res +=countMerge(arr,mid,low,high);
        }
        return res;
    }
    static long countMerge(long arr[], long mid, long low, long high){
        long n1 = mid - low + 1;
        long n2 = high - mid;
        long res = 0;
        long left[] = new long[(int)n1];
        long right[] = new long[(int)n2];
        for(int i=0;i<n1;i++){
            left[i] = arr[i+(int)low];
        }
        for(int j=0;j<n2;j++){
            right[j] = arr[(int)mid+1+j];
        }
        int i=0;
        int j=0;
        int k = (int)low;
        while(i<n1 && j<n2){
            if(left[i]<=right[j]){
                arr[k++] = left[i++];
            }
            else{
                arr[k++] = right[j++];
                res = res+(n1 - i);
                
            }
        }
         while(i<n1 ){
            
                arr[k++] = left[i++];
           
        }
        while(j<n2 ){
            
                arr[k++] = right[j++];
           
        }
        return res;
    }
}
